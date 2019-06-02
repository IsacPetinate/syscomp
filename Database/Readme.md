# Database (TXT Files)

> Informações

- A base de dados da aplicação é feita utilizando arquivos TXT (arquivos de texto livre - sem formatação)
- Arquivos
    - Produtos.txt
        - Registro de produtos do Vendedor para venda ao Comprador

    - Vendas.txt
        - Registo de vendas feitas, quantidade, valor ganho, etc.

    - Gastos.txt
        - Registro de compras/gastos feitas(os) pelo Comprador(Cliente)
---

> Estrutura

- Características do Arquivo
    - Cada registro no arquivo é escrito em linha única, e cada informação é separada por | (pipes)

- Modelagem/Lógica
    - Tabelas (Registros no Arquivo)
        - Vendedor (Proprietário)
            - Cadastro (Ação/Regra)
                - EstoqueInicial | ValorProduto | Produto

            - Venda (Consulta)
                - EstoqueInicial | QuantidadeVendida | ValorProduto | Produto | ValorVendas | EstoqueFinal
                    - ValorVendas = ValorProduto * QuantidadeVendida
                    - EstoqueFinal = EstoqueInicial - QuantidadeVendida

        - Comprador (Cliente)
            - Compra (Ação/Regra)
                - Quantidade | ValorProduto | Produto | ValorCarteira | ValorFinal
                    - ValorFinal = Valor Carteira - (ValorProduto * Quantidade)
