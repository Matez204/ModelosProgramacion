package figuras;

import java.util.ArrayList;

public class Circulo extends Figura{
    double radio;
    public Circulo(String color, ArrayList<Figura> content, double radio){
        super("Circulo", color, content);
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI*Math.pow(radio,2);
    }
    public Figura duplicar(){
        if(this.sizeContent() > 0) {
            return new Circulo(this.color, this.getContentDuplicado(), this.radio);
        }else {
            return new Circulo(this.color, new ArrayList<Figura>(), this.radio);
        }
    }
}
