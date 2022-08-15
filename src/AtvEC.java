import java.util.Scanner;

public class AtvEC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1
//        System.out.println("Digite a nota");
//        int nota = entrada.nextInt();
//        if (nota >=7){
//            System.out.println("APROVADO");
//        } else if (nota == 6) {
//            System.out.println("EXAME");
//        } else {
//            System.out.println("REPROVADO");
//        }
        //3,4,5
//        int numero = entrada.nextInt();
//        if (numero != 3){
//            System.out.println("Diferente de 3");
//        }
//
//        if (numero != 3 && numero != 5 && numero != 8){
//            System.out.println("Diferente de 3 5 8");
//        }
//
//        if (numero == 3 && numero == 5 && numero == 8){
//            System.out.println("Igual a 3 5 8");
//        }

        System.out.println("Escolha a operação");
        char operacao = entrada.next().charAt(0);
        System.out.println("Escolha os numeros");
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        if (operacao == '+'){
            System.out.println(x + y);
        }        if (operacao == '-'){
            System.out.println(x - y);
        }        if (operacao == '*'){
            System.out.println(x * y);
        }
        if (operacao == '/'){
            System.out.println(x / y);
        }



    }
}
