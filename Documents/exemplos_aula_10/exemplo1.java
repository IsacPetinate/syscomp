/*
 * Exemplo 1
 * Criação e escrita simples em um arquivo de texto
 */
package aula_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exemplo1 {
    public static void main(String[] args) {
        try {
            // Conteúdo a ser gravado no arquivo 'texto1.txt'
            String conteudo = "Arquivos em Java é muito fácil";

            // Cria arquivo no diretório do projeto
            File file = new File("texto1.txt");

            // Se o arquivo não existir, ele cria um novo
            if (!file.exists()) {
                file.createNewFile();
            }

            //Instanciamos a escrita do arquivo todo
            FileWriter writer = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(writer);
            
            // Escreve e fecha arquivo
            bw.write(conteudo);
            bw.close();
            
            // L o arquivo
            FileReader ler = new FileReader("texto1.txt");
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
