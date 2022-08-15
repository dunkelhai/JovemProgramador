import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Olá usuário! " +
        "Responda s para SIM e n para NÃO!");
        System.out.println("1- Você está com fome?");
        char escolha1 = entrada.nextLine().charAt(0);
        System.out.println("2- Você tem dinheiro?");
        char escolha2 = entrada.nextLine().charAt(0);
        if (escolha1 == 's' && escolha2 == 's') {
            System.out.println("Então peça uma pizza!");
        } else if (escolha1 == 'n' && escolha2 == 's') {
            System.out.println("Então invista em Bitcoin!");
        } else if (escolha1 == 's' && escolha2 == 'n') {
            System.out.println("Então vá trabalhar vagabundo!");
        } else {
            System.out.println("Então siga teu rumo parça!");
        }
        System.out.println("------------------------------------------------");
    }
}
