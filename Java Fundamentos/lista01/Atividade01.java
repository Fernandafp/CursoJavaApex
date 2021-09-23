package lista01;

import javax.swing.JOptionPane;

public class Atividade01{
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");

     
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o sua idade?"));


        String cidade = JOptionPane.showInputDialog(null, "Qual cidade que você mora?");
        
        JOptionPane.showMessageDialog(null, " Bom dia, "+nome +" você tem " +idade+ " anos. E mora na cidade de " +cidade +".");
        



    }
}