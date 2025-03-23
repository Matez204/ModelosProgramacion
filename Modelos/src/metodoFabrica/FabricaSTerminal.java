package metodoFabrica;

import output.Salida;
import output.SalidaTerminal;

public class FabricaSTerminal extends FabricaSalida {
    public Salida crear(){
        return new SalidaTerminal();
    }
}
