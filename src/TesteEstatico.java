public class TesteEstatico {
    public void mensagem(){
        System.out.println("Mensagem!");
    }

    public static void main(String[] args) {
        TesteEstatico teste = new TesteEstatico();
        teste.mensagem();
    }
}
