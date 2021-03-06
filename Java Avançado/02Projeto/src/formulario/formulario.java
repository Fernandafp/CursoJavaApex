package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario frame = new formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota1 = new JLabel("*  Primeira Nota *");
		lblNota1.setBounds(51, 46, 97, 14);
		contentPane.add(lblNota1);
		
		textNota1 = new JTextField();
		textNota1.setBounds(139, 43, 86, 20);
		contentPane.add(textNota1);
		textNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("*  Segunda Nota *");
		lblNota2.setBounds(51, 74, 97, 14);
		contentPane.add(lblNota2);
		
		textNota2 = new JTextField();
		textNota2.setColumns(10);
		textNota2.setBounds(139, 71, 86, 20);
		contentPane.add(textNota2);
		
		JLabel lblNota3 = new JLabel("*  Terceira Nota *");
		lblNota3.setBounds(51, 102, 97, 14);
		contentPane.add(lblNota3);
		
		textNota3 = new JTextField();
		textNota3.setColumns(10);
		textNota3.setBounds(139, 99, 86, 20);
		contentPane.add(textNota3);
		
		

		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(54, 221, 349, 14);
		contentPane.add(lblResultado);
		
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(139, 148, 89, 23);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				double nota1 = Double.parseDouble(textNota1.getText());
				double nota2 = Double.parseDouble(textNota2.getText());
				double nota3 = Double.parseDouble(textNota3.getText());
				
				double media = (nota1+nota2+nota3)/3;
				
				
				DecimalFormat df = new DecimalFormat ("0. ##");
				
				String mediaFormatada = df.format(media);
				
					
				
				String situacao = media >= 7 ? " Aprovado " : "Reprovado(a)";
				lblResultado.setText(situacao + " com m?dia "  + mediaFormatada);
				
			}catch(Exception erro) {
					lblResultado.setText("Falha ao calcular, tente novamente!");
				
				}
			}
			
		});
	}
}
		
