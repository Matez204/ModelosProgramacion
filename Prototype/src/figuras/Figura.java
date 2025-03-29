package figuras;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

public abstract class Figura  implements Duplicado{
    public String nombre;
    public String color;
    protected ArrayList<Figura> content;
    public Figura(String nombre, String color, ArrayList<Figura> content){
        this.nombre = nombre;
        this.color = color;
        this.content = content;
    }

    public abstract double getArea();
    public abstract Figura duplicar();

    protected ArrayList<Figura> getContentDuplicado(){
        ArrayList<Figura> copia = new ArrayList<Figura>();
        for (Figura f : this.content) {
            copia.add(f.duplicar());
        }
        return copia;
    }
    public void addFigura(Figura figura){
        this.content.add(figura);
    };
    public void deleteFigura(int posicion){
        this.content.remove(posicion);
    }
    public int sizeContent(){
        return this.content.size();
    };
    public String getContentList() throws IOException{
        StringWriter sw = new StringWriter();
        BufferedWriter bw = new BufferedWriter(sw);
        bw.write("{");
        bw.newLine();
        for(int i = 0; i < this.content.size(); i++){
            bw.write("  "+this.content.get(i).nombre + "{" + this.content.get(i).color + "} = " + i);
            bw.newLine();
        }
        bw.write("}");
        bw.newLine();
        bw.flush();
        return sw.toString();
    };
    public Figura getFigura(int posicion){
        return this.content.get(posicion);
    };
}
