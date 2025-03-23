package operaciones;

public class Razon extends Suma{
    public int operar(int a, int b){
        Resta resta = new Resta();
        int resultado = 0;
        int residuo = a;
        do {
            residuo = resta.operar(residuo, b);
            resultado = super.operar(resultado,1);
        } while (residuo > 0);
        return resultado;
    }
}
