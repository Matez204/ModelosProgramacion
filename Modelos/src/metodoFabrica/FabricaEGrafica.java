package metodoFabrica;

import input.Entrada;
import input.EntradaGrafica;

public class FabricaEGrafica extends FabricaEntrada{
    public Entrada crear(){
        return new EntradaGrafica();
    }
}
