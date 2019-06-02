/*
 * Exemplo 6
 * Leitura de dados em um arquivo de texto
 * manipulando individualmente  dos dados lidos
 * com conversão de tipo
 */
package aula_arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class exemplo6 {
    public static void main(String[] args) {
        String nome, nota, ra;
        try {
            // Cria arquivo no diretório do projeto
            File file = new File("alunos2.txt");

            // Se o arquivo não existir, ele cria um novo
            if (!file.exists()) {
                file.createNewFile();
            }
            
            // Lê o arquivo
            FileReader ler = new FileReader("alunos2.txt");
            BufferedReader reader = new BufferedReader(ler);
            Scanner entrada = new Scanner(reader);
            String linha;
            String dados[];
            
            //Percorre as linhas enquanto houver texto 
            while( (linha = reader.readLine()) != null ){
                dados = linha.split("\\|");
                nome = dados[0];
                nota = dados[1];
                ra = dados[2];
                System.out.print("Nome: "+nome);
                System.out.print(" - Nota: "+nota);
                System.out.println(" - RA: "+ra);
            }
       

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
