import input.*;
import operaciones.Suma;
import output.*;
import fabricacionAbstracta.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaTerminal();
        Entrada entrada = fabrica.crearEntrada();
        Salida salida = fabrica.crearSalida();
        Suma suma = new Suma();

        salida.enviar("Elija un nuevo tipo de fabrica: 1. Terminal 2. Grafica 3. Archivo");
        int opcion = Integer.parseInt(entrada.capturar());
        fabrica = switch(opcion){
            case 1 -> new FabricaTerminal();
            case 2 -> new FabricaGrafica();
            case 3 -> new FabricaArchivos();
            default -> {
                salida.enviar("No esta dentro de las opciones");
                yield new FabricaTerminal();
            }
        };
        salida.enviar("Fabrica de tipo: " + fabrica.getClass());
        if (!fabrica.getClass().equals(FabricaArchivos.class)){
            salida = fabrica.crearSalida();
            entrada = fabrica.crearEntrada();
            salida.enviar("Digite algo:");
            String algo = entrada.capturar();
            salida.enviar("Ese algo es " + algo);
        }else {
            salida.enviar("C:/Users/estudiantes/Pictures/testo.txt");
            String archivo = entrada.capturar();
            String[] lineas = archivo.split("\n");
            String[] numeros = lineas[0].split(",");
            fabrica = new FabricaTerminal();
            salida = fabrica.crearSalida();
            salida.enviar("Se sumaran " + numeros[0] + " y " + numeros[1]);
            salida.enviar("La suma es " + suma.operar(Integer.parseInt(numeros[0]), Integer.parseInt(numeros[1])));
        }
    }
}