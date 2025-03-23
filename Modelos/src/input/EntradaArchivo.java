package input;

import output.SalidaTerminal;

import java.io.*;
import java.util.stream.Collectors;

public class EntradaArchivo extends Entrada {
    public String capturar(){
        try{
            SalidaTerminal salida = new SalidaTerminal();
            EntradaTerminal entrada = new EntradaTerminal();
            salida.enviar("Escriba la direccion del archivo a capturar: ");
            String ruta = entrada.capturar();
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            String a = bf.lines().collect(Collectors.joining("\n"));
            bf.close();
            return a;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
