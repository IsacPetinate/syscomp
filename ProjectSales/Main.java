package ProjectSales;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        menu();
    }

    public static void menu() {
        Comprador comprador = new Comprador();
        Vendedor vendedor = new Vendedor();
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        opcao = 0;
        System.out.println("\n_________________________________________\n");
        System.out.println("Bem-vindo ao Syscomp - Sistema de Compras\n\n");

        System.out.println("Escolha uma opção para prosseguir: \n");

        System.out.print("[1] Comprar Produtos   \n");
        System.out.print("[2] Gerenciar Produtos \n");
        System.out.print("[3] Sair \n");

        System.out.print("Digite o Número da Opção Escolhida: ");

        try {
            opcao = entrada.nextInt();
        } catch (Exception e) {
            if (opcao <= 0 || opcao > 4)
                opcao = 3;
        }

        switch (opcao) {
        case 1:
            comprador.menuComprador();
            break;
        case 2:
            vendedor.menuVendedor();
            break;
        case 3:
            System.exit(0);
        }

        entrada.close();
    }
}
