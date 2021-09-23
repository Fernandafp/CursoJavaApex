package lista01;

import javax.swing.JOptionPane;

public class Atividade05 {
    public static void main(String[] args) {
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor do produto."));

        String pagamento = " Escolha uma forma de pagamento.";

        pagamento += "\n1) À Vista;";
        pagamento += "\n2) Parcelado;";

        int formaPagamento = Integer.parseInt(JOptionPane.showInputDialog(null, pagamento));

       if (valor > 500 && formaPagamento == 1) {
           JOptionPane.showMessageDialog(null, "Total a pagar R$"+(valor *0.9));
       }else{
           JOptionPane.showMessageDialog(null, "Total a pagar R$"+valor);
       }

    
    }
}
