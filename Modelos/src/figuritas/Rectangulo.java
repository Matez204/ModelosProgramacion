package figuritas;
import operaciones.Producto;

public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int area(){
        return Producto.operar(base,altura);
    }
}
