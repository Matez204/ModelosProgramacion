package metodoFabrica;

import input.Entrada;
import input.EntradaTerminal;

public class FabricaETerminal extends FabricaEntrada{
    public Entrada crear(){
        return new EntradaTerminal();
    }
}
