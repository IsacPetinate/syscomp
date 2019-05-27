package ProjectSales;

import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);

        Object[] opcoesPossiveis = { "Vendedor", "Comprador" };

        int selecionado;

        Object botaoSelecionado = JOptionPane.showOptionDialog(null, "Escolha:", "Opções",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
            null, opcoesPossiveis, opcoesPossiveis[0]
        );

        // convertendo para string
        selecionado = Integer.parseInt(botaoSelecionado.toString());

        if (selecionado == 1) {

            Comprador obj = new Comprador();
            obj.comprarProduto();

            // if necessario para que o usuario nao gaste mais que o permitido
            // if()
        }

        // Serve para fechar a entrada de dados para nao dar erro no code, é considerado
        // boas praticas também
        entrada.close();
    }

}