package figuritas;

import operaciones.Operacion;
import operaciones.Producto;

public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int area(){
        Operacion producto = new Producto();
        return producto.operar(base,altura);
    }
}
