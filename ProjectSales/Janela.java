package ProjectSales;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela {
    public static void main(String[] args) {
        janela();
    }

    public static void janela () {
        JFrame  frame  = new JFrame("Syscomp");
        JPanel  panel  = new JPanel(new GridLayout(4,4,4,4));
        
        // Configurações do Frame
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        frame.setContentPane(panel);
    }
}
