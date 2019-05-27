import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Botao extends JFrame
{
    private JButton ok, cancelar;

    public Botao() {
        super("Criando botões");
        setLayout(new FlowLayout());

        ok = new JButton("OK");
        cancelar = new JButton("Cancelar");
        add(ok);
        add(cancelar);
    }

}