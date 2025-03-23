package metodoFabrica;

import output.Salida;
import output.SalidaGrafica;

public class FabricaSGrafica extends FabricaSalida{
    public Salida crear(){
        return new SalidaGrafica();
    }
}
