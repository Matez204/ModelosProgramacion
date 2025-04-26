import util.*;

public class TestProxy {
    public static void main(String[] args) {
        Salida salida = new Salida();
        Operacion prs = new ProxySuma();
        salida.enviar("La suma es " + prs.operar(4,6));
        prs = new ProxyResta();
        salida.enviar("La resta es " + prs.operar(6,4));
        prs = new ProxyMulti();
        salida.enviar("La multiplicacion es " + prs.operar(6,-4));
        prs = new ProxyDivision();
        salida.enviar("La divicion es " + prs.operar(20, -5));
    }
}