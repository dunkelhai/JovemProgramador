import javax.swing.*;

public class DesafiosMetodos {
    //atividade 1

    public static String retornaValores(int x, int y){
        int soma = x+y;
        int divisao = x/y;
        int multiplicacao = x*y;
        int subtracao = x-y;

        String x1 = String.valueOf(soma);
        String x2 = String.valueOf(divisao);
        String x3 = String.valueOf(multiplicacao);
        String x4 = String.valueOf(subtracao);

        String resultado = x1 + " " + x2 +
               " " + x3 + " " + x4;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(retornaValores(4,2));
        JOptionPane.showMessageDialog(null,retornaValores(4,2));
    }
}
