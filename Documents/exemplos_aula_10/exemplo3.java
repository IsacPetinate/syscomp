/*
 * Exemplo 3
 * Leitura de dados em um arquivo de texto
 */
package aula_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class exemplo3 {
    public static void main(String[] args) {
        
        try {
            // Cria arquivo no diretório do projeto
            File file = new File("alunos1.txt");

            // Se o arquivo não existir, ele cria um novo
            if (!file.exists()) {
                file.createNewFile();
            }
            
            // Lê o arquivo
            FileReader ler = new FileReader("alunos1.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            
            //Percorre as linhas enquanto houver texto 
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }
          

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
