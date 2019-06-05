package ProjectSales;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela {
    public static void main(String[] args) {
        JFrame  frame  = new JFrame("Syscomp");
        
        // Configurações do Frame
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainPanel panel = new MainPanel();
        panel.createMenu();
        frame.setContentPane(panel);
    }
}
