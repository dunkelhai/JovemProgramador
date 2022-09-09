package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
           String[] vetor = sc.nextLine().split(" ");
           int posicao = sc.nextInt();
           System.out.println(vetor[posicao]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida");
        } catch (InputMismatchException e){
            System.out.println("Dado diferente do esperado");
        }
        System.out.println("FIM DO PROGRAMA");
    }
}
