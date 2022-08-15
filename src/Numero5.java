import java.util.ArrayList;
import java.util.Scanner;

public class Numero5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList listaNomes = new ArrayList();
        String nome;char sexo;int totalM = 0;int totalF = 0;
        for (int i = 0; i < 4; i++){
            System.out.println("Digite o nome: ");
            nome = entrada.nextLine();
            listaNomes.add(nome);
            System.out.println("F feminino M masculino: ");
            sexo = entrada.next().charAt(0);
            if (sexo == 'm' || sexo == 'M'){
                totalM++;
                entrada.nextLine();
            } else if (sexo == 'f' || sexo == 'F') {
                totalF++;
                entrada.nextLine();
            } else {
                entrada.nextLine();
                System.out.println("Inválido");
            }
        }
        System.out.println("Nomes: " + listaNomes);
        System.out.println("Total de mulheres: " + totalF);
        System.out.println("Total de homens: " + totalM);
    }
}
