import figuras.*;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Figura cuadrado = new Cuadrado("rojo", new ArrayList<Figura>(),4);
        Figura cuadrado1 = new Cuadrado("Azul", new ArrayList<Figura>(), 5);
        cuadrado.addFigura(cuadrado1);
        cuadrado.addFigura(new Circulo("Blanco", new ArrayList<Figura>(),5));

        Figura cuadradoCopia = cuadrado.duplicar();
        cuadradoCopia.getFigura(1).color = "Rojo";
        System.out.println(cuadrado.getContentList());
        System.out.println(cuadradoCopia.getContentList());
    }
}