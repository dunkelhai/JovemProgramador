import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOTeste{
    public static void main(String[] args){
        // Algo que deseja mostrar (aviso, mensagem de erro)
        String erro = "Erro 404: não foi possível encontrar o batman";

        // Cria um JFrame
        JFrame frame = new JFrame("JOptionPane exemplo");

        // Cria o JOptionPane por showMessageDialog
        JOptionPane.showMessageDialog(frame,
                "Houve um problema ao procurar o batman:\n\n '" + erro + "'.", //mensagem
                "Erro 404", // titulo da janela
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}