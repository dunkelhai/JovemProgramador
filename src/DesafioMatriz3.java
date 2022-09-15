import java.util.Arrays;
import java.util.Random;

public class DesafioMatriz3 {
    public static void main(String[] args) {
        Random rd = new Random();
        Integer[][][] matriz = new Integer[4][4][4];
        for (int c = 0; c < matriz.length; c++){
            for (int l = 0; l < matriz[c].length; l++){
                for (int d = 0; d < matriz[c].length; d++){
                matriz[c][l][d] = rd.nextInt(100);
            }
        }
        }
        System.out.println(Arrays.deepToString(matriz));
    }
}
