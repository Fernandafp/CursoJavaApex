import javax.swing.JOptionPane;

public class CaixaMensagem {
    
    public static void main(String[] args) {
        
        // Exibir mensagem
        //JOptionPane.showMessageDialog(null, "Hello World");

        // Pedir um nome
        String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Bom dia "+nome);

    }

}