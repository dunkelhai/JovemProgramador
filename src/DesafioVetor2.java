import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DesafioVetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[2];
        Double[] notas = new Double[2];
        Double soma = 0.0;
        Double media = 0.0;
        for (int i = 0; i < nomes.length; i++){
            System.out.println("DIGITE O NOME");
            nomes[i] = sc.nextLine();
        }
        for (int l = 0; l < nomes.length; l++) {
            System.out.println("DIGITE NOTA");
            notas[l] = sc.nextDouble();
        }
        for (int j = 0; j < notas.length; j++){
            soma += notas[j];
        }media = soma/notas.length;
        System.out.println("Soma é: " + soma);
        System.out.println("Média é: " + media);
        System.out.println(Arrays.toString(nomes));
        for (int k = 0; k < nomes.length; k++){
            if (notas[k] >= media){
                System.out.println("Aluno " + nomes[k]
                + " passou com nota " + notas[k]);
            } else {
                System.out.println("Aluno " + nomes[k]
                        + " reprovou com nota " + notas[k]);
            }
        }

    }
}
