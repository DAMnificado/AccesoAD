package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej05 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JTextField passField;

	private JButton logIn;
	private JButton saveButton;
	private boolean guardada = false;
	private String contraseña;

	public Ej05() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		passField = new JTextField();
		passField.setColumns(10);
		passField.setBounds(107, 153, 203, 51);
		contentPane.add(passField);

		JLabel lblNewLabel = new JLabel("Escribe contraseña");
		lblNewLabel.setBounds(168, 115, 193, 44);
		contentPane.add(lblNewLabel);

//BOTONES
		logIn = new JButton("sigamos");
		logIn.setBounds(396, 212, 170, 71);
		contentPane.add(logIn);
		logIn.addActionListener(this);

		saveButton = new JButton("Guardar");
		saveButton.setBounds(381, 106, 203, 62);
		contentPane.add(saveButton);
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

					System.out.println("Meu esta vacía");

				}

			 else if (button == logIn && contraseña.isBlank()) {
					System.out.println("No puedes logear con la contraseña vacia muxxaxo");
				}
				
				
				
				
				

			}
			 if (button == saveButton && guardada == true) {

				System.out.println("La contraseña ya ha sido guardada y es: " + contraseña);
			} 
			 if (button == logIn && guardada == true) {

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
