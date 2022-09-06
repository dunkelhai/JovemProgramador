import java.util.Arrays;
public class DesafioMatriz1 {
    public static void main(String[] args) {
        String[][] matriz = new String[3][3];
        for (int c = 0; c < matriz.length; c++){
            for (int l = 0; l < matriz[c].length; l++){
                matriz[c][l] = "SENAC";
            }
        }
        System.out.println(Arrays.deepToString(matriz));
    }
}
