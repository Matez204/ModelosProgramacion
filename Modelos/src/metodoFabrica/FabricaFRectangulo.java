package metodoFabrica;

import figuritas.Figura;
import figuritas.Rectangulo;

public class FabricaFRectangulo extends FabricaFiguritas{
    public Figura crear(int[] medidas){
        return new Rectangulo(medidas[0],medidas[1]);
    }
}
