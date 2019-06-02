/*
 * Exemplo 4
 * Leitura de dados em um arquivo de texto
 * manipulando individualmente  dos dados lidos
 */
package aula_arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class exemplo4 {
    public static void main(String[] args) {
        String nome, nota;
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
            Scanner entrada = new Scanner(reader);
            String linha;
            String dados[];
            
            //Percorre as linhas enquanto houver texto 
            while( (linha = reader.readLine()) != null ){
                dados = linha.split(" ");//Separamos os dados, sabendo que há uma divisão pelo 'espaço'
                nome = dados[0];//Recebe o primeiro dado, referente a nome
                nota = dados[1];//Recebe o segundo dado, referente a nome
                System.out.println(nome+" "+nota);
            }
          

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
