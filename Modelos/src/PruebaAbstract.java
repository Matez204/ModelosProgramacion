/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.abstractfactory;
import com.mycompany.abstractfactory.fabricacion.*;
import com.mycompany.abstractfactory.operaciones.*;
import com.mycompany.abstractfactory.input.Entrada;
import com.mycompany.abstractfactory.output.Salida;
/**
 *
 * @author estudiantes
 */
public class PruebaAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fabrica;
        Suma suma = new Suma();
        Salida salida;
        Entrada entrada;
        fabrica = new FabricaTerminal();
        salida = fabrica.crearSalida();
        entrada = fabrica.crearEntrada();
        
        salida.enviar("Escribe un numero 1:");
        String numero = entrada.capturar();
        salida.enviar("Escribe otro numero");
        String numero1 = entrada.capturar();
        salida.enviar("La suma es " + suma.operar(Integer.parseInt(numero), Integer.parseInt(numero1)));
        
        fabrica = new FabricaGrafica();
        salida = fabrica.crearSalida();
        entrada = fabrica.crearEntrada();
        
        salida.enviar("Escribe un numero 1:");
        numero = entrada.capturar();
        salida.enviar("Escribe otro numero");
        numero1 = entrada.capturar();
        salida.enviar("La suma es " + suma.operar(Integer.parseInt(numero), Integer.parseInt(numero1)));
        
        fabrica = new FabricaArchivos();
        salida = fabrica.crearSalida();
        entrada = fabrica.crearEntrada();
        
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
