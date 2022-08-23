public class AtividadeMetodos2 {
    public static boolean ePar(int x){
        if (x % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(ePar(9));
        System.out.println("Erro");
    }
}
