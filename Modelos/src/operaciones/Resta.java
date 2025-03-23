package operaciones;

public class Resta extends Suma{
    public int operar(int a, int b){
        return super.operar(a,-b);
    }
}
