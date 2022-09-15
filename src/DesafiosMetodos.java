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

    //Atividade 2

    public static double pitagoras(double cateto1,
                                   double cateto2){
        double hipotenusa = 0;
        //a2= b2 + c2
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2)
                + Math.pow(cateto2, 2));
        return Math.round(hipotenusa);
    }

    public static double divisao(int x, int y){
        return x/y;
    }

    public static void opaitaoff(int senha){
        if (senha == 1234){
            JOptionPane.showMessageDialog(null,
                    "DESLIGANDO");
        } else {
            JOptionPane.showMessageDialog(null,
                    "NÃO DESLIGARÁ");
        }
    }

     public static void resultados(int v1, int v2){
         System.out.println(v1 + v2);
         System.out.println(v1 * v2);
         System.out.println(v1 / v2);
         System.out.println(v1 - v2);
     }

     public static double mediaGasolina(double distancia, double gasosa){
        return distancia * gasosa;
     }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,retornaValores(4,2));
        System.out.println(pitagoras(2.89,5.89));
        System.out.println(divisao(2,3));
        String digitado = JOptionPane.showInputDialog("" +
                "DIGITE A SENHA");
        opaitaoff(Integer.parseInt(digitado));
        resultados(2,4);
        mediaGasolina(2000,45);




    }
}
