import javax.swing.*;
import java.util.Scanner;

public class AulaMetodos {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(Math.sqrt(25));
        if (somar(x) > 10){
            System.out.println("X * 10 é Maior que 10");
        } else {
            System.out.println("X * 10 é Menor que 10");
        }
    }
    public static int somar(int numero){
       numero = numero * (2 + 8);
       return numero;
    }



//    String digitado = JOptionPane.showInputDialog("Digite um numero: ");
//    int numero = Integer.parseInt(digitado);
//    fatorar(numero);
//    }
//    public static void fatorar(int numero){
//       int fator = 1;
//       for (int i = numero; i > 1; i--){
//           fator = fator * i;
//       }
//       JOptionPane.showMessageDialog(null,
//               "O fatorial é: " + fator);
//    }

    }

