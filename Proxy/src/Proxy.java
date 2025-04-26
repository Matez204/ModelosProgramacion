import util.Salida;

public  abstract class Proxy implements Operacion{
    public static Suma suma;
    public Proxy(){
        if (suma == null){
            Salida s = new Salida();
            s.enviar("Suma instanciada");
            suma = new Suma();
        }
    }
    public abstract int operar(int a, int b);
}
