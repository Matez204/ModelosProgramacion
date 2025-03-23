package fabricacionAbstracta;

import output.Salida;
import output.SalidaTerminal;
import input.Entrada;
import input.EntradaTerminal;

public class FabricaTerminal extends Fabrica{
    public Salida crearSalida(){
        return new SalidaTerminal();
    }
    public Entrada crearEntrada(){
        return new EntradaTerminal();
    }
}
