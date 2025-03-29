package figuras;

import java.util.ArrayList;

public class Cuadrado extends Figura {
    public double lado;
    public Cuadrado(String color, ArrayList<Figura> content, double lado){
        super("Cuandrado",color,content);
        this.lado = lado;
    }
    public double getArea(){return lado*lado;}
    public Figura duplicar(){
        if (this.sizeContent()>0){
            return new Cuadrado(this.color,this.getContentDuplicado(),this.lado);
        }else {
            return new Cuadrado(this.color,new ArrayList<Figura>(),this.lado);
        }
    }
}
