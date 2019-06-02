Scanner entrada = new Scanner(System.in);

'''java

public class Teste {
    public satic void main (String args[]) {
        Object[] opcoesPossiveis = { "Vendedor", "Comprador" };

        int selecionado;

        Object botaoSelecionado = JOptionPane.showOptionDialog(null, "Escolha:", "Opções",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
            null, opcoesPossiveis, opcoesPossiveis[0]
        );

        selecionado = Integer.parseInt(botaoSelecionado.toString());

        if (selecionado == 1) {
            Comprador obj = new Comprador();
            obj.comprarProduto();
        }
    }
}
'''