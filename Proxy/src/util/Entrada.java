package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Entrada {
    InputStream in = System.in;
    InputStreamReader inn = new InputStreamReader(in, StandardCharsets.UTF_8);
    BufferedReader br = new BufferedReader(inn);
    public String capturar(){
        try{
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
