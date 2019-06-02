/*
** Esta classe é referente ao Vendedor (Proprietario)
** Este ator acessa o sistema para cadastrar produtos 
** e analisar/verificar seus produtos e suas vendas
*/

package ProjectSales;

import java.util.Scanner;

import javax.swing.JOptionPane;

// import java.util.ArrayList;

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
        System.out.print("[2] Consultar Vendas \n");
        System.out.print("[3] Sair             \n");

        System.out.print("Digite o Número da Opção Escolhida: ");
        opcao = entrada.nextInt();

        switch (opcao)
        {
            case 1:
                cadastrarProdutos();
            case 2:
                consultarVendas();
            case 3:
                break;
        }

        entrada.close();
	}

    private void consultarVendas() {
        ManipularArquivos.lerRegistroVendas();
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

            String produto = codigo  + " | " + nome + " | " + valor + " | " + quantidade;

            ManipularArquivos.escreverArquivo("Produtos.txt", produto);
            
            opcao = JOptionPane.showOptionDialog(null, "Deseja cadastrar mais produtos?", "Cadastro de Produtos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        } while(opcao == 0);

    }
}