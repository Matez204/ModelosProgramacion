package output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class SalidaTerminal extends Salida{
    OutputStream o = System.out;
    OutputStreamWriter out = new OutputStreamWriter(o, StandardCharsets.UTF_8);
    BufferedWriter bw = new BufferedWriter(out);
    public void enviar(String a){
        try{
            bw.write(a +"\n");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
