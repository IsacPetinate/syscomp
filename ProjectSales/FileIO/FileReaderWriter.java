package ProjectSales.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriter 
{
    public static void escreverArquivo(String nomeArquivo, String conteudo) 
    {
        try 
        {
            // String produto = nome + "|" + codigo + "|" + quantidade + "|" + valor;

            File file = new File("produtos.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(writer);

            // Escreve e fecha arquivo
            bw.write(conteudo);
            bw.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void lerArquivo(String nomeArquivo, String produto, String valor, String codigo)
    {
        try
        {
            FileReader ler = new FileReader(nomeArquivo);
            BufferedReader reader = new BufferedReader(ler);

            Scanner entrada = new Scanner(reader);
            String linha;
            String dados[];

            while( (linha = reader.readLine()) != null ){
                dados = linha.split("\\|");
                produto = dados[0];
                valor = dados[1];
                codigo = dados[2];

                System.out.print("Produto: "     + produto);
                System.out.print(" - Valor: "    + valor);
                System.out.println(" - Código: " + codigo);
            }

            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}