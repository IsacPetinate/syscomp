/*
 * Exemplo 7
 * Adicionando dados em arquivo de texto
 * com interação de usuário 
 */
package aula_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class exemplo7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "latin1");
        String conteudo;
        char continua;
        do{
            System.out.println("Digite a frase a ser gravada: ");
            conteudo = entrada.nextLine();
            try {
                // Cria arquivo no diretório do projeto
                File file = new File("texto3.txt");

                // Se o arquivo não existir, ele cria um novo
                if (!file.exists()) {
                    file.createNewFile();
                }

                //Instanciamos a escrita do arquivo todo
                //Adicionamos o 2º paramêtro 'true' para habilitar a gravação ao final do arquivo
                FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(writer);

                // Escreve e fecha arquivo
                bw.write(conteudo);
                bw.newLine();
                bw.close();

                // Lê o arquivo
                FileReader ler = new FileReader("texto3.txt");
                BufferedReader reader = new BufferedReader(ler);  
                String linha;

                //Percorre as linhas enquanto houver texto 
                while( (linha = reader.readLine()) != null ){
                    System.out.println(linha);
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Inserir mais uma frase? (s) ou (n): ");
            continua = entrada.nextLine().charAt(0);
        }while(continua != 'n');
    }
}
