/*
** Esta classe é referente ao Vendedor (Proprietario)
** Este ator acessa o sistema para cadastrar produtos 
** e analisar/verificar seus produtos e suas vendas
*/

package ProjectSales;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Vendedor
{
	public void menuVendedor()
    {
        Scanner entrada = new Scanner (System.in);
        int opcao = 0;

        System.out.println();
        System.out.println("__________________________________");
        System.out.println();
        System.out.println("O que deseja? \n");

        System.out.print("[1] Cadastrar Produto\n");
        System.out.print("[2] Lista de Produtos\n");
        System.out.print("[3] Consultar Vendas \n");
        System.out.print("[4] Voltar           \n");
        System.out.print("[5] Sair             \n");

        System.out.print("Digite o Número da Opção Escolhida: ");
        try {
            opcao = entrada.nextInt();
        } catch (Exception e) {
            if (opcao <= 0 || opcao > 5) opcao = 3;
        }

        switch (opcao)
        {
            case 1:
                cadastrarProdutos();
            case 2:
                listarProdutos();
            case 3:
                consultarVendas();
            case 4:
                Main.menu();
            case 5:
                System.exit(0);
        }

        entrada.close();
	}

    private void consultarVendas() {
        ManipularArquivos.lerRegistroVendas();
    }

    private void listarProdutos() {
        try {
            ManipularArquivos.lerArquivo("Produtos.txt");
        } catch (Exception e) {
            menuVendedor();
        }
    }

    private void cadastrarProdutos() {
        System.out.println("Cadastrar Produto");
        System.out.println();
        String[] opcoes = { "SIM", "NAO" };
        
        int opcao;
        
        do {
            String codigo     = JOptionPane.showInputDialog(null, "Código:     ");
            String valor      = JOptionPane.showInputDialog(null, "Valor:      ");
            String nome       = JOptionPane.showInputDialog(null, "Nome:       ");
            String quantidade = JOptionPane.showInputDialog(null, "Quantidade: ");

            String produto = codigo  + " | " + nome + " | " + valor + " | " + quantidade + "\n";

            ManipularArquivos.escreverArquivo("Produtos.txt", produto);
            
            opcao = JOptionPane.showOptionDialog(null, "Deseja cadastrar mais produtos?", "Cadastro de Produtos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        } while(opcao == 0);

    }
	public static void registrarVenda(double codigo, double valor, double quantidade) {
        String conteudo = codigo + " | " + valor + " | " + quantidade;
        ManipularArquivos.escreverArquivo("Vendas.txt", conteudo);
	}
}