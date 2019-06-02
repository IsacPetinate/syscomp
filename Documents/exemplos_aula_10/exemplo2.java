/*
 * Exemplo 2
 * Criação e escrita simples em um arquivo de texto
 * com entrada de dado via usuário
 */
package aula_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "latin1");
        String conteudo;
        System.out.println("Digite a frase a ser gravada: ");
        conteudo = entrada.nextLine();
        try {
            // Cria arquivo no diretório do projeto
            File file = new File("texto2.txt");

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
            
            // Lê o arquivo
            FileReader ler = new FileReader("texto2.txt");
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
