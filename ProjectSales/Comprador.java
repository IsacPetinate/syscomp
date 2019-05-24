package ProjectSales;

public class Comprador
{
  public double qtdDinheiro = 100.0;

  public double comprarProduto (double valorProduto, int quantidade)
  {
    double divida = valorProduto * quantidade;
    return qtdDinheiro -= divida;
  }
}