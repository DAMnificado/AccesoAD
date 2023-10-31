package swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FrameEjemplo_swing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameEjemplo_swing frame = new FrameEjemplo_swing();
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
	public FrameEjemplo_swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("Pon tu nombre");
		textField.setBounds(140, 67, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NOMBRE:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(58, 70, 72, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnSaludar = new JButton("Saludar");
		btnSaludar.addActionListener(new FrameEj_ManejadorBottones());
	
		btnSaludar.setName("saludar");
		btnSaludar.setMnemonic(KeyEvent.VK_S);
		
		
		btnSaludar.setBounds(58, 129, 89, 23);
		contentPane.add(btnSaludar);
		
		JButton btnInsultar = new JButton("PRUEBA");
		btnInsultar.setName("insultar");
		btnInsultar.setToolTipText("DALLE DALLE QUE LIBRAS");
		btnInsultar.setBounds(193, 129, 89, 23);
		btnInsultar.addActionListener(new FrameEj_ManejadorBottones());
		contentPane.add(btnInsultar);
	}
}
