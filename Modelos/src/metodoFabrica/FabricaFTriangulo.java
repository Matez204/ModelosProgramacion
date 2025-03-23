package metodoFabrica;

import figuritas.Figura;
import figuritas.Triangulo;

public class FabricaFTriangulo extends FabricaFiguritas{
    public Figura crear(int[] medidas){
        return new Triangulo(medidas[0],medidas[1]);
    }
}
