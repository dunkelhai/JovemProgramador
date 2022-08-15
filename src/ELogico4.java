import java.util.Random;
import java.util.Scanner;

public class ELogico4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas idades quer avaliar? ");
        int escolha = entrada.nextInt();
        int[] idades = new int[escolha];
        Random aleatorio = new Random();
        for (int i = 0; i < idades.length; i++){
            idades[i] = aleatorio.nextInt(100);
            if (idades[i] >= 18){
                System.out.println("Pode ser presa! " + idades[i]);
            } else {
                System.out.println("Ainda toma todynho! " + idades[i]);
            }
        }

    }
}
