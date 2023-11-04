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
import java.awt.Font;
import javax.swing.JLayeredPane;


public class Ej05SecondClass extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private String contraseña;
	private JTextField passField2;
	private String contraseña2;
	private JLabel escribePass;
	private JTextField textField;
	

	
	
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
		
		JButton comprobar = new JButton("Comprueba si es correcta");
		comprobar.setBounds(379, 139, 179, 51);
		contentPane.add(comprobar);
		
		escribePass = new JLabel("Escribe tu contraseña");
		escribePass.setBounds(198, 101, 112, 28);
		contentPane.add(escribePass);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(217, 161, 1, 1);
		contentPane.add(layeredPane);
		
		textField = new JTextField();
		textField.setBounds(191, 223, 119, 37);
		contentPane.add(textField);
		textField.setColumns(10);
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
		
		
	


