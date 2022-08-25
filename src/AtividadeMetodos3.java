import java.util.Scanner;

public class AtividadeMetodos3 {
    public static void main(String[] args) {
        int vetor1[] = new int[10];
        int soma = 0;
        float media = 0;
        lerVetor(vetor1);
        soma = somarNumeros(vetor1);
        System.out.println("A soma �: " + soma);
        media = calcularMedia(vetor1);
        System.out.println("A m�dia �: " + media);
    }

    static void lerVetor(int[] vetor1){

        Scanner entrada = new Scanner(System.in);

        int i;

        for (i = 0; i < vetor1.length; i++){
            System.out.println("Digite o " + (i + 1) + " n�mero: ");
            vetor1[i] = entrada.nextInt();

        }
    }

    private static int somarNumeros(int[] vetor1) {
        int acmSoma = 0, i;

        for (i = 0; i < vetor1.length; i++){
            acmSoma += vetor1[i];
        }
        return acmSoma;
    }

    private static float calcularMedia(int[] vetor1) {

        float media;
        media = somarNumeros(vetor1) / vetor1.length;
        return media;

    }
}
