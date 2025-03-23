package figuritas;
import operaciones.Producto;

public class Circulo extends Figura{
    private int radio;
    private final int pi = 3;
    public Circulo(int radio){
        this.radio = radio;
    }
    public int area(){
        return Producto.operar(pi,Producto.operar(radio,radio));
    }
}
