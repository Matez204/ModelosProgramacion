package operaciones;

public class Razon extends Operacion {
    public int operar(int dividendo, int divisor){
        Resta resta = new Resta();
        if(divisor == 0){
            throw new ArithmeticException("No se puede dividir por cero");
        }

        boolean signo = true;
        if (dividendo < 0){
            dividendo = -dividendo;
            signo = !signo;
        }
        if (divisor < 0){
            divisor = -divisor;
            signo = !signo;
        }

        int resultado = 0;
        int residuo = dividendo;

        do {
            residuo = resta.operar(residuo, divisor);
            resultado = super.operar(resultado,1);
        } while (residuo >= divisor);


        return signo ? resultado : -resultado;
    }
}
