import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        System.out.println("A) Quem é Meliodas?");
        System.out.println("1- Anão bombado" +
                "\n2- Pneu furado" +
                "\n3- Protagonista ruim" +
                "\n4- Gado");
        int escolha1 = entrada.nextInt();
        if (escolha1 == 3){
            total++;
            System.out.println("Acertou");
        } else {
            System.out.println("errou");
        }
        System.out.println("B) Quem ganhou a copa em 94?");
        System.out.println("1- Zambia" +
                "\n2- Chad" +
                "\n3- Angola" +
                "\n4- Chechenia");
        int escolha2 = entrada.nextInt();
        if (escolha2 == 1){
            total++;
            System.out.println("ACertou");
        } else {
            System.out.println("Errou");
        }
        System.out.println("VOcê acertou " + total);

    }
}
