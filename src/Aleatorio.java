import java.util.Arrays;
import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        int idade[] = new int[66];
        Random aleatorio = new Random();
        for (int i = 0; i < idade.length; i++){
            idade[i] = aleatorio.nextInt(100);
            if (idade[i] >= 18){
                System.out.println(idade[i] +" maior de idade");
            } else {
                System.out.println(idade[i] + "menor de idade");
            }
        }
        System.out.println(Arrays.toString(idade));
    }
}
