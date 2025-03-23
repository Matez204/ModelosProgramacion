import input.*;
import metodoFabrica.*;
import operaciones.*;
import output.*;
import figuritas.*;

public class PruebaCliente {
    public static void main(String[] args) {
        FabricaEntrada fabricaE = new FabricaETerminal();
        FabricaSalida fabricaS = new FabricaSTerminal();
        Entrada entrada = fabricaE.crear();
        Salida salida = fabricaS.crear();
        Operacion operacion = new Operacion();

        salida.enviar("Elija los tipo de salidas y entradas a fabricar: 1. Terminal 2. Grafica");
        int opcion = Integer.parseInt(entrada.capturar());
        fabricaE = switch(opcion){
            case 1 -> new FabricaETerminal();
            case 2 -> new FabricaEGrafica();
            default -> {
                salida.enviar("No esta dentro de las opciones");
                yield new FabricaETerminal();
            }
        };
        fabricaS = switch(opcion){
            case 1 -> new FabricaSTerminal();
            case 2 -> new FabricaSGrafica();
            default -> {
                salida.enviar("No esta dentro de las opciones");
                yield new FabricaSTerminal();
            }
        };
        salida = fabricaS.crear();
        entrada = fabricaE.crear();
        salida.enviar("Digite un numero:");
        String a = entrada.capturar();
        salida.enviar("Escriba otro numero:");
        String b = entrada.capturar();
        salida.enviar("Suma: "+a+" + "+b+" = "+operacion.operar(Integer.parseInt(a),Integer.parseInt(b)));
        operacion = new Resta();
        salida.enviar("Resta: "+a+" - "+b+" = "+operacion.operar(Integer.parseInt(a),Integer.parseInt(b)));
        operacion = new Producto();
        salida.enviar("Producto: "+a+" * "+b+" = "+operacion.operar(Integer.parseInt(a),Integer.parseInt(b)));
        operacion = new Razon();
        salida.enviar("Razon: "+a+" / "+b+" = "+operacion.operar(Integer.parseInt(a),Integer.parseInt(b)));

        FabricaFiguritas fabricaF = new FabricaFCuadrado();
        salida.enviar("Areas de figuras ;D");
        salida.enviar("Escriba un lado de un cuadrado");
        int[] numeros = new int[1];
        numeros[0] = Integer.parseInt(entrada.capturar());
        Figura figura = fabricaF.crear(numeros);
        salida.enviar("El area del cuadrado es " + figura.area());

        salida.enviar("Escriba la base de un triangulo:");
        numeros = new int[2];
        numeros[0] = Integer.parseInt(entrada.capturar());
        salida.enviar("Escriba la altuar del triangulo");
        numeros[1] = Integer.parseInt(entrada.capturar());
        fabricaF = new FabricaFTriangulo();
        figura = fabricaF.crear(numeros);
        salida.enviar("El area del triangulo es " + figura.area());

        salida.enviar("Escriba la base de un rectangulo:");
        numeros = new int[2];
        numeros[0] = Integer.parseInt(entrada.capturar());
        salida.enviar("Escriba la altuar del rectangulo");
        numeros[1] = Integer.parseInt(entrada.capturar());
        fabricaF = new FabricaFRectangulo();
        figura = fabricaF.crear(numeros);
        salida.enviar("El area del rectangulo es " + figura.area());

        salida.enviar("Escribe el radio de un circulo: ");
        numeros = new int[1];
        numeros[0] = Integer.parseInt(entrada.capturar());
        fabricaF = new FabricaFCirculo();
        figura = fabricaF.crear(numeros);
        salida.enviar("El area del circulo es " + figura.area());
    }
}