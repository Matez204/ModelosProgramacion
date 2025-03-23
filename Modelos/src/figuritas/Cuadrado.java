package figuritas;

import operaciones.Operacion;
import operaciones.Producto;

public class Cuadrado extends Figura{
    private int lado;
    public Cuadrado(int lado){
        this.lado = lado;
    }
    public int area(){
        Operacion producto = new Producto();
        return producto.operar(this.lado,this.lado);
    }
}
