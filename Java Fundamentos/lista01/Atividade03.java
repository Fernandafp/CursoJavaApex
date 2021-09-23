package lista01;

import javax.swing.JOptionPane;

public class Atividade03 {
    public static void main(String[] args) {
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a terceira nota"));

        double media = (nota1 + nota2 + nota3)/2;
        JOptionPane.showMessageDialog(null, "A média é " +media);

         String mensagem = media >= 7 ? "Aprovado" : " Reprovado";
         JOptionPane.showMessageDialog( null, mensagem);
    }
}
