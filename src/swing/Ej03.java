package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.KeyEventDispatcher;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej03 extends JFrame implements KeyListener {

	private JPanel contentPane;
	private JTextField textFieldLado1;
	private JTextField textFieldLado2;
	private JTextField textFieldLado3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej03 frame = new Ej03("EJERCICIO 3");
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
	public Ej03(String titulo) {
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 384);
		contentPane = new JPanel();
		contentPane.setName("calcular");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ingresar el lado 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(58, 104, 172, 26);
		contentPane.add(lblNewLabel);

		JLabel lblIngresarElLado = new JLabel("Ingresar el lado 2");
		lblIngresarElLado.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblIngresarElLado.setBounds(58, 152, 172, 26);
		contentPane.add(lblIngresarElLado);

		JLabel lblIngresarElLado_1 = new JLabel("Ingresar el lado 3");
		lblIngresarElLado_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblIngresarElLado_1.setBounds(58, 202, 172, 26);
		contentPane.add(lblIngresarElLado_1);

		JLabel lblResultado = new JLabel("El áreal del triángulo");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblResultado.setBounds(58, 287, 535, 26);
		contentPane.add(lblResultado);

		textFieldLado1 = new JTextField();
		textFieldLado1.setBounds(238, 111, 143, 19);
		contentPane.add(textFieldLado1);
		textFieldLado1.setColumns(10);
		textFieldLado1.addKeyListener(this);

		textFieldLado2 = new JTextField();
		textFieldLado2.setColumns(10);
		textFieldLado2.setBounds(240, 159, 143, 19);
		contentPane.add(textFieldLado2);
		textFieldLado2.addKeyListener(this);

		textFieldLado3 = new JTextField();
		textFieldLado3.setColumns(10);
		textFieldLado3.setBounds(238, 209, 143, 19);
		contentPane.add(textFieldLado3);
		textFieldLado3.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		textField = (JTextField) e.getSource();
	
		char c = e.getKeyChar();
		
		if (textField.getText().contains(".") && c == '.') {
		e.consume();
		} if (!Character.isDigit(c) && c!='.') {
			e.consume();
		}


	}

	@Override //cuando la mantenga presionada
	public void keyPressed(KeyEvent e) {
	
	}

	@Override // cuando la suelte
	public void keyReleased(KeyEvent e) {
	
	}
}