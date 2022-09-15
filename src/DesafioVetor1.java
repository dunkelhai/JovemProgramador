import java.util.Arrays;
import java.util.Scanner;

public class DesafioVetor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetor = new String[8];
        for (int i = 0; i < vetor.length; i++){
            System.out.println("DIGITE NOME");
            vetor[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(vetor));
    }
}
