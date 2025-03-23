package fabricacionAbstracta;

import output.Salida;
import output.SalidaArchivo;
import input.Entrada;
import input.EntradaArchivo;

public class FabricaArchivos extends Fabrica{
    public Salida crearSalida(){
        return new SalidaArchivo();
    }
    public Entrada crearEntrada(){
        return new EntradaArchivo();
    }
}
