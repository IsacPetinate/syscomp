/*
** Esta classe é referente ao Comprador (cliente)
** Este ator acessa o sistema para comprar produtos 
** e analisar/verificar suas compras e sua carteira
*/

package ProjectSales;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Comprador
{
    public void menuComprador()
    {
        Scanner entrada = new Scanner (System.in);
        int opcao = 0;

        System.out.println("\n__________________________________\n");
        System.out.println("O que deseja?     \n");

        System.out.print("[1] Comprar Produto \n");
        System.out.print("[2] Gastos Recentes \n");
        System.out.print("[3] Voltar          \n");
        System.out.print("[4] Sair            \n");

        System.out.print("Digite o Número da Opção Escolhida: ");
        try {
            opcao = entrada.nextInt();
        } catch (Exception e) {
            if (opcao <= 0 || opcao > 4) opcao = 3;
        }

        switch (opcao)
        {
            case 1:
                comprarProduto();
            case 2:
                consultarCompras();
            case 3:
                Main.menu();
            case 4:
                System.exit(0);
        }

        entrada.close();
	}

    public void comprarProduto() {

        listarProdutos();

        double codigo     = Integer.parseInt(JOptionPane.showInputDialog("Codigo:     "));
        double valor      = Integer.parseInt(JOptionPane.showInputDialog("Valor:      "));
        double quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));

        double resultado = valor * quantidade;
        double divida = resultado - valor;
        

        JOptionPane.showMessageDialog(null, "Valor Gasto: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Saldo Restante: " + divida, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        registrarCompra(codigo, valor, quantidade);
        Vendedor.registrarVenda(codigo, valor, quantidade);
    }

    private void consultarCompras() {
        ManipularArquivos.lerArquivo("Gastos.txt");
    }
    private void listarProdutos() {
        ManipularArquivos.lerArquivo("Produtos.txt");
    }
    private void registrarCompra(double codigo, double valor, double quantidade) {
        String conteudo = codigo + " | " + valor + " | " + quantidade;
        ManipularArquivos.escreverArquivo("Gastos.txt", conteudo);
    }
}
