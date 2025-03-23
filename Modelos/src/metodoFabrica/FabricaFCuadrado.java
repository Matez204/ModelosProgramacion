package metodoFabrica;

import figuritas.Cuadrado;
import figuritas.Figura;

public class FabricaFCuadrado extends FabricaFiguritas{
    public Figura crear(int[] medidas){
        return new Cuadrado(medidas[0]);
    }
}
