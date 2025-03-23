package figuritas;

import operaciones.Razon;
import operaciones.Producto;

public class Triangulo extends Figura{
    private int base;
    private int altura;
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public int area(){
        Producto producto = new Producto();
        Razon razon = new Razon();
        return razon.operar(producto.operar(base,altura),2);
    }
}
