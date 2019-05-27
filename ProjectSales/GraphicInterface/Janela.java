package ProjectSales.GraphicInterface;

import ProjectSales.GraphicInterface.Painel;
import javax.swing.JFrame;

public class Janela
{
    public void criar(int altura, int largura, String titulo, boolean visivel)
    {
        JFrame janela = new JFrame(titulo);
        Painel painel = new Painel();
        
        janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janela.add(painel);
        janela.setSize(altura, largura);
        janela.setVisible(visivel);
    }
}