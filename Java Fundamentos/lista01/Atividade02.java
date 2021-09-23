package lista01;

import javax.swing.JOptionPane;

public class Atividade02 {
    public static void main(String[] args) {
        
    int numero = Integer.parseInt(JOptionPane.showInputDialog( null, " Digite um número inteiro"));

    String mensagem = numero < 0 ? "Negativo" : "Positivo";

    mensagem +=  "\n";

    mensagem += numero % 2 == 0 ? "Par" : "Ímpar";
JOptionPane.showMessageDialog( null, mensagem);

}
}
