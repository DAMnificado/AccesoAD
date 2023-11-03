package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Ej05SecondClass extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private String contraseña;
	private JTextField passField2;
	private String contraseña2;
	

	
	
	public Ej05SecondClass(String contraseña) {
		
		this.contraseña = contraseña;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		passField2 = new JTextField();
		passField2.setColumns(10);
		passField2.setBounds(146, 139, 203, 51);
		contentPane.add(passField2);
		
		JButton comprobar = new JButton("comprueba");
		comprobar.setBounds(375, 126, 183, 77);
		contentPane.add(comprobar);
		comprobar.addActionListener(this);
	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		contraseña2 = passField2.getText();
		if (contraseña.equals(contraseña2)) {
			System.out.println("Contraseña correcta!");
			
			} else {
				System.out.println("Contraseña incorrecta!");
			}
	}
}
		
		
	


