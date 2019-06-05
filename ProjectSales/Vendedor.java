/*
** Esta classe é referente ao Vendedor (Proprietario)
** Este ator acessa o sistema para cadastrar produtos 
** e analisar/verificar seus produtos e suas vendas
*/

package ProjectSales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vendedor {
    public void menuVendedor() {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        System.out.println("\n__________________________________\n");
        System.out.println("O que deseja? \n");

        System.out.print("[1] Cadastrar Produtos   \n");
        System.out.print("[2] Produtos Cadastrados \n");
        System.out.print("[3] Produtos Vendidos    \n");
        System.out.print("[4] Voltar               \n");
        System.out.print("[5] Sair                 \n");

        System.out.print("Digite o Número da Opção Escolhida: ");
        try {
            opcao = entrada.nextInt();
        } catch (Exception e) {
            if (opcao <= 0 || opcao > 5)
                opcao = 3;
        }

        switch (opcao) {
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
        try {
            ManipularArquivos.lerRegistroVendas();
        } catch (Exception e) {
            Main.menu();
        }
    }

    private void listarProdutos() {
        try {
            ManipularArquivos.lerArquivo("Produtos.txt");
        } catch (Exception e) {
            Main.menu();
        }
    }

    private void cadastrarProdutos() {
        System.out.println("Cadastrar Produto");
        System.out.println();
        String[] opcoes = { "SIM", "NAO" };

        int opcao;

        try {
            do {
                String codigo = JOptionPane.showInputDialog(null, "Código:     ");
                String valor  = JOptionPane.showInputDialog(null, "Valor:      ");
                String nome   = JOptionPane.showInputDialog(null, "Nome:       ");
                String quantidade = JOptionPane.showInputDialog(null, "Quantidade: ");

                String produto = codigo + " | " + nome + " | " + valor + " | " + quantidade + "\n";

                ManipularArquivos.escreverArquivo("Produtos.txt", produto);

                opcao = JOptionPane.showOptionDialog(null, "Deseja cadastrar mais produtos?", "Cadastro de Produtos",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            } while (opcao == 0);
        } catch (Exception e) {
            Main.menu();
        }
    }

    public static void registrarVenda(double codigo, double valor, double quantidade) {
        String conteudo = codigo + " | " + valor + " | " + quantidade;

        try {
            ManipularArquivos.escreverArquivo("Vendas.txt", conteudo);
        } catch (Exception e) {
            Main.menu();
        }
    }
}