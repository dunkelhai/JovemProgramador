import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
        boolean continuar = true;
    Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
            int escolha = entrada.nextInt();
            switch (escolha) {
                case 5,6,7:
                    System.out.println("Inf A");
                    break;
                case 2:
                    System.out.println("Norte");
                    break;
                case 3:
                    System.out.println("Leste");
                    break;
                default:
                    System.out.println("INVÁLIDO!");
                    break;
            }
        }
    }

