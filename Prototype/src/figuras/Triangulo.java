package figuras;

import java.util.ArrayList;

public class Triangulo extends Figura{
    double base;
    double altura;
    public Triangulo(String color, ArrayList<Figura> content, double base, double altura){
        super("Triangulo",color,content);
        this.base = base;
        this.altura = altura;
    }
    public double getArea(){return (base*altura)/2;}
    public Figura duplicar(){
        if (this.sizeContent()>0){
            return new Triangulo(this.color,this.getContentDuplicado(),this.base, this.altura);
        }else {
            return new Triangulo(this.color,new ArrayList<Figura>(),this.base, this.altura);
        }
    }
}
