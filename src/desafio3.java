import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class desafio3 {
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        double preco1, preco2, preco3;
        String produto1, produto2, produto3;
        Scanner entrada = new Scanner(System.in);
        System.out.println(":::::::: PRODUTOS ::::::::");
        System.out.println("Boas vindas Usu�rio");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Digite o nome do produto 1:");
        produto1 = entrada.nextLine();
        System.out.println("Digite o pre�o do produto 1:");
        preco1 = entrada.nextDouble();
        entrada.nextLine();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Digite o nome do produto 2:");
        produto2 = entrada.nextLine();
        System.out.println("Digite o pre�o do produto 2:");
        preco2 = entrada.nextDouble();
        entrada.nextLine();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Digite o nome do produto 3:");
        produto3 = entrada.nextLine();
        System.out.println("Digite o pre�o do produto 3:");
        preco3 = entrada.nextDouble();
        if (preco1 > preco2 && preco1 > preco3){
            System.out.println("Produto 1: " + produto1 +
                    " Valor: " + preco1 + " � o mais caro!");
        } else if (preco2 > preco1 && preco2 > preco3){
            System.out.println("Produto 2: " + produto2 +
                    " Valor: " + preco2 + " � o mais caro!");
        } else {
            System.out.println("Produto 3: " + produto3 +
                    " Valor: " + preco3 + " � o mais caro!");
        }
        System.out.println("::::::::::::::::::::::::::");
    }
}
