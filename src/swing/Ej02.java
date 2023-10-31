package swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ej02 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldRadio;
	private JTextField textFieldAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej02_swing frame = new Ej02_swing();
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
	public Ej02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Ingresar el radio");
		etiqueta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiqueta1.setBounds(63, 94, 132, 35);
		contentPane.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Ingresar la altura");
		etiqueta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiqueta2.setBounds(63, 146, 132, 35);
		contentPane.add(etiqueta2);
		
		JLabel etiquetaVolumen = new JLabel("Volumen");
		etiquetaVolumen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiquetaVolumen.setBounds(63, 215, 413, 35);
		contentPane.add(etiquetaVolumen);
		
		JLabel etiquetaArea = new JLabel("Area");
		etiquetaArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiquetaArea.setBounds(63, 254, 413, 35);
		contentPane.add(etiquetaArea);
		
		textFieldRadio = new JTextField();
		
		textFieldRadio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			    char c = e.getKeyChar();
			    if (!Character.isDigit(c) && c != '.') {
			    	   JOptionPane.showMessageDialog(null, "Solo se permiten números");
			           e.consume();
			    }
			}
		});
		textFieldRadio.setBounds(205, 103, 96, 20);
		contentPane.add(textFieldRadio);
		textFieldRadio.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
			    if (!Character.isDigit(c) && c != '.') {
			           e.consume();
			    }
			}
		});
		textFieldAltura.setColumns(10);
		textFieldAltura.setBounds(205, 155, 96, 20);
		contentPane.add(textFieldAltura);
		
		JButton botonCalcular = new JButton("Calcular");
		botonCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double radio = Double.parseDouble(textFieldRadio.getText());
					double altura = Double.parseDouble(textFieldAltura.getText());
					double volumen = Math.PI*Math.pow(radio, 2)*altura;
					double area = 2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio, 2);
					etiquetaVolumen.setText("Volumen: "+String.valueOf(String.format("%.2f", volumen)));
					etiquetaArea.setText("Area: "+String.valueOf(String.format("%.2f", area)));
				} catch (NumberFormatException e1) {
					textFieldRadio.setText("");
					JOptionPane.showMessageDialog(null, "Debe ingresar un numero válido");
					
				}
			}
		});
		botonCalcular.setBounds(355, 102, 89, 23);
		contentPane.add(botonCalcular);
		
		JButton JButtonReiniciar = new JButton("Reiniciar");
		JButtonReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldRadio.setText("");
				textFieldAltura.setText("");
				etiquetaVolumen.setText("Volumen");
				etiquetaArea.setText("Area");
				
			}
		});
		JButtonReiniciar.setBounds(355, 154, 89, 23);
		contentPane.add(JButtonReiniciar);
	}
}
