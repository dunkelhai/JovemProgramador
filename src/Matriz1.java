public class Matriz1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        int x = 4;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = x;
                x++;
                System.out.println(matriz[i][i]);
            }
        }



    }
}
