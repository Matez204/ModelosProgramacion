package operaciones;

public class Razon extends Operacion {
    public int operar(int a, int b){
        Resta resta = new Resta();
        if(b == 0){
            throw new ArithmeticException("No se puede dividir por cero");
        }

        boolean signo = true;
        if (a < 0){
            a = -a;
            signo = !signo;
        }
        if (b < 0){
            b = -b;
            signo = !signo;
        }

        int resultado = 0;
        int residuo = a;

        do {
            residuo = resta.operar(residuo, b);
            resultado = super.operar(resultado,1);
        } while (residuo >= b);


        return signo ? resultado : -resultado;
    }
}
