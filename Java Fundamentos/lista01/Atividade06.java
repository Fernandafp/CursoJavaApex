package lista01;

import javax.swing.JOptionPane;

public class Atividade06 {
   public static void main(String[] args) {

    int horario = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe horário de Brasília."));

       String Cidade = "Escolha uma Cidade.";

       Cidade += "\n1) Cidade do México";
       Cidade += "\n2) Nova Iorque";
       Cidade += "\n3) Tóquio";

       int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, Cidade));

switch(opcao){

            case 1:
            JOptionPane.showMessageDialog(null, "Você escolheu Cidade do México, que tem, " +(horario - 3)+ "horas.");
            break;

            case 2:
            JOptionPane.showMessageDialog(null, "Você escolheu Nova Iorque, que tem " +(horario + 2 )+ "horas.");
            break;

            case 3:
            JOptionPane.showMessageDialog(null, "Você escolheu Tóquio, que tem " +(horario + 12 )+ "horas.");
            break;

            default:
            JOptionPane.showMessageDialog(null, "Opção Inválida");
        }


   } 
}
