package ProjectSales.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Syscomp");
        JLabel label = new JLabel("tituloLabel");
        JPanel panel = new JPanel();

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(label);
        frame.add(panel);
    }

    public void criaJanela() {
        //
    }
}
