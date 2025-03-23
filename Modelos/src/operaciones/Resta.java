package operaciones;

public class Resta extends Operacion {
    public int operar(int a, int b){
        return super.operar(a,-b);
    }
}
