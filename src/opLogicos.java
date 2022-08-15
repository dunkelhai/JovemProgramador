import java.util.Scanner;

public class opLogicos {
    public static void main(String[] args) {
        int x = 1;
        int a = 3;
        int b = 5;
        int c = 8;
        int d = 7;
        System.out.println("Letra a: " + !(x>3));
        System.out.println("Letra b: " + ((x<1) && !(b>d)));
        System.out.println("Letra c: " + (!(d<0)&&(c>5)));
        System.out.println("Letra d: " + ((x>3)||(c<7)));
        System.out.println("Letra e: " + (a>b || c>b));
        System.out.println("Letra f: " + (x>=2));
        System.out.println("Letra g: " + ((x<1) && (b>=3)));
        System.out.println("Letra h: " + ((x<1) && (b>=3) && (a>7)));
        System.out.println("Letra i: " + ((x<1) || (b>=3) && (a>7)));

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        if (numero < 10 && numero > 5){
            System.out.println(numero + " na faixa");
        } else {
            System.out.println(numero + " Fora da faixa");
        }
        entrada.close();








    }
}
