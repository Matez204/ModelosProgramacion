package output;

import javax.swing.JOptionPane;

public class SalidaGrafica extends Salida{
    public void enviar(String a){
        JOptionPane.showMessageDialog(null, a, "mensaje", JOptionPane.PLAIN_MESSAGE);
    }
}
