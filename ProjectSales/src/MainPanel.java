package ProjectSales;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements Serializable {

    private static final long serialVersionUID = 1L;

    public MainPanel() {
        super();

        setLayout(new GridLayout(3, 3));
        JButton button = new JButton("Apertar");
        add(button);
    }


}