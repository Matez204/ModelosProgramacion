package metodoFabrica;

import figuritas.Circulo;
import figuritas.Figura;

public class FabricaFCirculo extends FabricaFiguritas{
    public Figura crear(int[] medidas){
        return new Circulo(medidas[0]);
    }
}
