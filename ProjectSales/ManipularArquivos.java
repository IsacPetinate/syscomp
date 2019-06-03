package ProjectSales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ManipularArquivos 
{
    public static void escreverArquivo(String nomeArquivo, String conteudo) 
    {
        String caminho = "C:/Users/ipetinate/Desktop/syscomp/Database/";

        try 
        {
            File file = new File(caminho + nomeArquivo);

            if (!file.exists()) file.createNewFile();

            FileWriter writer = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write(conteudo);
            bw.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void lerArquivo (String nomeArquivo) {
        String caminho = "C:/Users/ipetinate/Desktop/syscomp/Database/";
        String nome, codigo, valor, quantidade;

        try
        {
            FileReader ler = new FileReader(caminho + nomeArquivo);
            BufferedReader reader = new BufferedReader(ler);

            Scanner entrada = new Scanner(reader);
            String linha;
            String dados[];

            while( (linha = reader.readLine()) != null )
            {
                dados      = linha.split("\\|");
                codigo     = dados[0];
                nome       = dados[1];
                valor      = dados[2];
                quantidade = dados[3];

                String produto =  "Código: " + codigo  + " | " +   "Produto: " + nome + " | " + "Valor: R$" + valor + " | " + "Quantidade: " + quantidade;  

                JOptionPane.showMessageDialog(null, produto, "Syscomp - Produtos", JOptionPane.PLAIN_MESSAGE);
            }
            entrada.close();
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void lerRegistroVendas()
    {
        String arquivo = "C:/Users/ipetinate/Desktop/syscomp/Database/Vendas.txt";
        String nome, codigo, valor, quantidade;

        try
        {
            FileReader ler = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(ler);

            Scanner entrada = new Scanner(reader);
            String linha;
            String dados[];

            while( (linha = reader.readLine()) != null )
            {
                dados      = linha.split("\\|");
                codigo     = dados[0];
                nome       = dados[1];
                valor      = dados[2];
                quantidade = dados[3];

                String produto =  "Código: " + codigo  + " | " +   "Produto: " + nome + " | " + "Valor: " + valor + " | " + "Quantidade: " + quantidade;  

                JOptionPane.showMessageDialog(null, produto, "Syscomp - Produtos", JOptionPane.PLAIN_MESSAGE);
            }
            entrada.close();
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}