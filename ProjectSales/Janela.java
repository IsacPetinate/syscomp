package ProjectSales;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela {
    public static void main(String[] args) {
        String nomeBotao = "OK";

        JFrame  frame  = new JFrame("Syscomp");
        JLabel  label  = new JLabel("tituloLabel");
        JPanel  panel  = new JPanel(new GridLayout(4,4,4,4));
        JButton button = new JButton(nomeBotao);

        // Configurações do Frame
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Confgurações do Botao
        button.setPreferredSize(new Dimension(30, 30));
        // Confgurações do Panel
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // Adição de elementos no frame
        frame.setContentPane(panel);
        frame.add(label);
        frame.add(button);
    }
}
