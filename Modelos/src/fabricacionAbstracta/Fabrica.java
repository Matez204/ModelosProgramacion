package fabricacionAbstracta;
import output.Salida;
import input.Entrada;


public abstract class Fabrica {
    public abstract Salida crearSalida();
    public abstract Entrada crearEntrada();
}
