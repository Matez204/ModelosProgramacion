public class ProxyDivision extends Proxy{
    public int operar(int a, int b){
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
            residuo = suma.operar(residuo, -b);
            resultado = suma.operar(resultado,1);
        } while (residuo >= b);

        return signo ? resultado : -resultado;
    }
}
