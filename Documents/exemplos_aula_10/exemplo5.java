/*
 * Exemplo 5
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

public class exemplo5 {
    public static void main(String[] args) {
        String nome;
        double nota, soma = 0.0, media;
        int cont = 0;
        try {
            // Cria arquivo no diretório do projeto
            File file = new File("alunos1.txt");

            // Se o arquivo não existir, ele cria um novo
            if (!file.exists()) {
                file.createNewFile();
            }
            
            // Lê  o arquivo
            FileReader ler = new FileReader("alunos1.txt");
            BufferedReader reader = new BufferedReader(ler);
            Scanner entrada = new Scanner(reader);
            String linha;
            String dados[];
            
            //Percorre as linhas enquanto houver texto 
            while( (linha = reader.readLine()) != null ){
                dados = linha.split(" ");
                nome = dados[0];
                nota = Double.parseDouble(dados[1]);//Convertemos para double
                soma += nota;
                cont++;
            }
            media = soma / cont;
            System.out.println("Média :"+media);
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
