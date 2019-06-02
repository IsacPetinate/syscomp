package ProjectSales;

import java.util.Scanner;
import ProjectSales.Comprador;

public class Main
{
    public static void main(String args[])
    {
        Comprador comprador = new Comprador();
        Vendedor vendedor = new Vendedor();
        Scanner entrada = new Scanner (System.in);
        
        int opcao = 0;

        System.out.println("Bem-vindo ao Syscomp - Sistema de Compras\n\n");

        System.out.println("Escolha uma opção para prosseguir: \n");

        System.out.print("[1] Comprar Produtos   \n");
        System.out.print("[2] Gerenciar Produtos \n");
        System.out.print("[3] Sair               \n");

        System.out.print("Digite o Número da Opção Escolhida: ");
        opcao = entrada.nextInt();

        switch (opcao)
        {
            case 1:
                comprador.menuComprador();
            case 2:
                vendedor.menuVendedor();
            case 3:
                break;
        }

        entrada.close();
    }

}