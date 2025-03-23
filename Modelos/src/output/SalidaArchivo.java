package output;

import java.io.*;

public class SalidaArchivo extends Salida {
    public void enviar (String a){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(a));
            String texto;
            Salida salida = new SalidaTerminal();

            while((texto = bf.readLine()) != null){
                salida.enviar(texto);
            }
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
