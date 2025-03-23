package figuritas;

import operaciones.Operacion;
import operaciones.Producto;

public class Circulo extends Figura{
    private int radio;
    private final int pi = 3;
    public Circulo(int radio){
        this.radio = radio;
    }

    public int area(){
        Operacion producto = new Producto();
        return producto.operar(pi,producto.operar(radio,radio));
    }
}
