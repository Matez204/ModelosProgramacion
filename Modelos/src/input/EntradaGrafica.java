package input;

import javax.swing.JOptionPane;

public class EntradaGrafica extends Entrada{
    public String capturar(){
        return JOptionPane.showInputDialog("");
    }
}
