package ProjectSales;

import java.util.Scanner;

// import java.util.ArrayList;

public class Vendedor
{
	public void menuVendedor()
    {
        Scanner entrada = new Scanner (System.in);
        int opcao = 0;

        System.out.println("__________________________________");
        System.out.println("O que deseja? \n");

        System.out.print("[1] Cadastrar Produto\n");
        System.out.print("[2] Consultar Vendas \n");
        System.out.print("[3] Sair             \n");

        System.out.print("Digite o Número da Opção Escolhida: ");
        opcao = entrada.nextInt();

        switch (opcao)
        {
            case 1:
                comprar();
            case 2:
                consultar();
            case 3:
                break;
        }

        entrada.close();
	}

    private void consultar() {
        ManipularArquivo.lerArquivo("consulta.txt");
    }

    private void comprar() {

    }
}