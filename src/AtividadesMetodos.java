import javax.swing.*;
import java.util.Scanner;

public class AtividadesMetodos {
    public static void exibirMes(int mes){
        JFrame frame = new JFrame("JOptionPane exemplo");

        switch (mes){
            case 1:
                JOptionPane.showMessageDialog(frame, "Janeiro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite aqui:");
        int numero = Integer.parseInt(entrada);
        exibirMes(numero);
    }
}
