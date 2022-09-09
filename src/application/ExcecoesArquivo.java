package application;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ExcecoesArquivo {
    public static void main(String[] args) {
        String caminho = "C:\\Users" +
                "\\alysson.oliveira\\pasta\\texto.txt";
        File arquivo = new File(caminho);
        Scanner entrada = null;
        try{
            entrada = new Scanner(arquivo);
            while (entrada.hasNextLine()){
                System.out.println(entrada.nextLine());
            }
        } catch (IOException e){
            System.out.println("Erro ao abrir arquivo " +
                    e.getMessage());
        } finally {
            if (entrada != null){
                entrada.close();
            }
        }
    }
}
