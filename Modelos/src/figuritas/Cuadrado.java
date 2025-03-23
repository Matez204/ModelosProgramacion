package figuritas;
import operaciones.Producto;
public class Cuadrado extends Figura{
    private int lado;
    public Cuadrado(int lado){
        this.lado = lado;
    }
    public int area(){
        return Producto.operar(this.lado,this.lado);
    }
}
