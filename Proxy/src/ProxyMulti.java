public class ProxyMulti extends Proxy{
    public int operar(int a, int b){
        int r = 0;
        boolean signo = true;
        if (a < 0){
            a = -a;
            signo = !signo;
        }
        if (b < 0){
            b = -b;
            signo = !signo;
        }
        for(int i = 1; i <= b; i++){
            r = suma.operar(r,a);
        }
        return signo ? r : -r;
    }
}
