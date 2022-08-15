import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        double lado1,lado2,lado3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o lado 1:");
        lado1 = entrada.nextDouble();
        System.out.println("Entre com o lado 2:");
        lado2 = entrada.nextDouble();
        System.out.println("Entre com o lado 3:");
        lado3 = entrada.nextDouble();
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Equilátero");
        } else if ((lado1 == lado2 && lado2 != lado3)||
        (lado1 == lado3 && lado3 != lado2)||
        (lado3 == lado2 && lado2 != lado1)){
            System.out.println("Isóceles");
        } else {
            System.out.println("Escaleno");
        }
        entrada.close();
    }
}
