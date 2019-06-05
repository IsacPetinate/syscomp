package ProjectSales;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela {
    public static void main(String[] args) {
        String nomeBotao = "OK";

        JFrame  frame  = new JFrame("Syscomp");
        JLabel  label  = new JLabel("tituloLabel");
        JPanel  panel  = new JPanel();
        JButton button = new JButton(nomeBotao);

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(label);
        frame.add(panel);
        frame.add(button);
    }

    public void criaJanela() {
        //
    }
}
