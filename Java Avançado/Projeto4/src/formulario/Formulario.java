package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor = new JLabel("Informe o valor da compra.");
		lblValor.setBounds(41, 11, 178, 20);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(229, 11, 168, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JCheckBox ckbVista = new JCheckBox("Pagamento \u00E0 Vista");
		ckbVista.setBounds(123, 38, 155, 23);
		contentPane.add(ckbVista);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double valor = Double.parseDouble(txtValor.getText());
					
					boolean aVista = ckbVista.isSelected();
					
					if (valor >= 100 && aVista == true) {
						JOptionPane.showInternalMessageDialog(null," R$" + (valor * 0.95));
					}else {
						JOptionPane.showInternalMessageDialog(null," R$" + valor);
					}
					
				}catch (Exception erro) {
					JOptionPane.showInternalMessageDialog(null,"Informe o valor da Compra!");
					
				}
				
			}
		});
		btnEnviar.setBounds(308, 66, 89, 23);
		contentPane.add(btnEnviar);
	}
}
