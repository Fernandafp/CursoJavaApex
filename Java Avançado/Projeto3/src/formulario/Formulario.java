package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
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
		setBounds(100, 100, 556, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor = new JLabel("Informe o valor convertido");
		lblValor.setBounds(35, 23, 196, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(241, 20, 278, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JComboBox <String>comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					double valor = Double.parseDouble(txtValor.getText());
					int opcao = comboBox.getSelectedIndex();
					
					switch(opcao) {
					case 1:
					JOptionPane.showInternalMessageDialog(null, valor / 5.5);
						break;
						
					case 2:
					JOptionPane.showInternalMessageDialog(null, valor * 5.5);
						break;
						
					case 3:
					JOptionPane.showInternalMessageDialog(null, valor / 6.5);
						break;
					
					case 4:
					JOptionPane.showInternalMessageDialog(null, valor * 6.5);
						break;
					}
					
					
				}catch(Exception erro) {}
			}
				
			
		});
	
		
		
		
		
		comboBox.addItem("Escolha o tipo de convers?o");
		comboBox.addItem("Real para D?lar");
		comboBox.addItem("D?lar para Real");
		comboBox.addItem("Real para Euro");
		comboBox.addItem("Euro para Real");
		comboBox.setBounds(35, 68, 484, 22);
		contentPane.add(comboBox);
	}
}
