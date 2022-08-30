import java.util.Scanner;

public class ClasseVetor1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer numeroPessoas = sc.nextInt();
    Double[] alturas = new Double[numeroPessoas];
    double somaAlturas = 0;

    for (int x = 0; x < alturas.length; x++){
        System.out.println("Digite a altura");
        alturas[x] = sc.nextDouble();
    }
    for (int x = 0; x < alturas.length; x++){
        somaAlturas += alturas[x];
    }
        System.out.println(somaAlturas);
        System.out.printf("Média: %.2f",somaAlturas/numeroPessoas);
    }
}
