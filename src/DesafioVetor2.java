import java.util.Locale;
import java.util.Scanner;

public class DesafioVetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        Double[] notas = new Double[5];
        Double soma = 0.0;
        Double media = 0.0;
        for (int i = 0; i < nomes.length; i++){
            System.out.println("DIGITE O PRIMEIRO NOME");
            nomes[i] = sc.next();
            System.out.println("DIGITE NOTA");
            notas[i] = sc.nextDouble();
        }for (int j = 0; j < notas.length; j++){
            soma += notas[j];
        }media = soma/notas.length;
        System.out.println("Soma é: " + soma);
        System.out.println("Média é: " + media);


    }
}
