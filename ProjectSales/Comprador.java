package ProjectSales;

import javax.swing.JOptionPane;

public class Comprador
{

    public void comprarProduto ()
    {
        int valor = 1000;

        double preco = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do produto "));
        double qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));

        //calcula quanto o usuario gastou
        double resultado = preco * qtd;

        //calcula o saldo restante
        double divida = valor - resultado ;

        //exibe o valor gasto
        JOptionPane.showMessageDialog(null,"Valor Gasto: "+resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);

        //exibe o saldo
        JOptionPane.showMessageDialog(null,"Saldo Restante: "+divida,"Resultado",JOptionPane.INFORMATION_MESSAGE);





    }
}