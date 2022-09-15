import java.util.Random;

public class DesafioVetor3 {
    public static void main(String[] args) {
        Random curioso = new Random();
        Integer[] vetor = new Integer[100];
        Integer soma = 0;
        for (int i = 0; i < 100; i++){
            vetor[i] = curioso.nextInt(100);
        }
        for (int j = 0; j < vetor.length; j++){
            soma += vetor[j];
        }
        System.out.println(soma);
    }
}
