package fabricacionAbstracta;

import output.Salida;
import output.SalidaGrafica;
import input.Entrada;
import input.EntradaGrafica;

public class FabricaGrafica extends Fabrica{
    public Salida crearSalida(){
        return new SalidaGrafica();
    }
    public Entrada crearEntrada(){
        return new EntradaGrafica();
    }
}
