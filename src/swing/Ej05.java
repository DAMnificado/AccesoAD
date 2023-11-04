package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Ej05 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JTextField passField;

	private JButton seguir;
	private JButton saveButton;
	private boolean guardada = false;
	private String contraseña;
	private JLabel escribeUnUser;
	private JTextField userField;

	public Ej05() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		passField = new JTextField();
		passField.setHorizontalAlignment(SwingConstants.LEFT);
		passField.setColumns(10);
		passField.setBounds(88, 112, 203, 51);
		contentPane.add(passField);

		JLabel escribeUnaPass = new JLabel("Escribe una contraseña");
		escribeUnaPass.setHorizontalAlignment(SwingConstants.CENTER);
		escribeUnaPass.setBounds(88, 215, 203, 32);
		contentPane.add(escribeUnaPass);

//BOTONES
		seguir = new JButton("Seguir");
		seguir.setBounds(403, 176, 170, 71);
		contentPane.add(seguir);
		seguir.addActionListener(this);

		saveButton = new JButton("Guardar");
		saveButton.setBounds(381, 106, 203, 62);
		contentPane.add(saveButton);
		
		JLabel titulo = new JLabel("Crear cuenta");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		titulo.setForeground(new Color(0, 128, 0));
		titulo.setBounds(312, 11, 94, 32);
		contentPane.add(titulo);
		
		escribeUnUser = new JLabel("Escribe un nombre de usuario");
		escribeUnUser.setHorizontalAlignment(SwingConstants.CENTER);
		escribeUnUser.setBounds(88, 74, 203, 38);
		contentPane.add(escribeUnUser);
		
		userField = new JTextField();
		userField.setBounds(88, 246, 203, 51);
		contentPane.add(userField);
		userField.setColumns(10);
		saveButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	
		JButton button = (JButton) e.getSource();
		
		try {

			if (guardada == false) {
				
				 contraseña = passField.getText();
				
				
				if (button == saveButton && !contraseña.isBlank()) {
					
					
					this.guardada = true;
					System.out.println(guardada);

				} 
				
				
				else if (button == saveButton && contraseña.isBlank()) {

					System.out.println("No puedes guardar una contraseña vacía");

				}

			 else if (button == seguir && contraseña.isBlank()) {
					System.out.println("No puedes logear con la contraseña vacía");
				}
				
				
				
				
				

			}
			 if (button == saveButton && guardada == true) {

				System.out.println("La contraseña ya ha sido guardada y es: " + contraseña);
			} 
			 if (button == seguir && guardada == true) {

					System.out.println("Veamos si puedes iniciar sesion");
					System.out.println("contraseña es: " + contraseña);
					contentPane.setVisible(false);
					Ej05SecondClass frame2 = new Ej05SecondClass(contraseña);

					frame2.setVisible(true);

				}

		} catch (NullPointerException e2) {

			System.err.println("GHoncho mañana voy pa vigo");
		}

	}
}
