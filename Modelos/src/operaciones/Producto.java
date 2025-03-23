package operaciones;

public class Producto extends Operacion {
    public int operar(int a, int b){
        int resultado = 0;
        for(int i = 1; i <= b; i++){
            resultado = super.operar(resultado,a);
        }
        return resultado;
    }
}
