package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.KeyEventDispatcher;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaTriangulo extends JFrame implements KeyListener {

	private JPanel contentPane;
	private JTextField textFieldLado1;
	private JTextField textFieldLado2;
	private JTextField textFieldLado3;
	private JTextField textField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaTriangulo frame = new AreaTriangulo("AREA TRIÁNGULO");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AreaTriangulo(String titulo) {
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 384);
		contentPane = new JPanel();
		contentPane.setName("calcular");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		
		
		
		//LABEL
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

		
		
		
		
		
		
		
		
		
		//BOTONES
		//CALCULAR
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String lado1 = textFieldLado1.getText();
				String lado2 = textFieldLado2.getText();
				String lado3 = textFieldLado3.getText();
				
				Double lado1Double = Double.parseDouble(textFieldLado1.getText());
				Double lado2Double = Double.parseDouble(textFieldLado2.getText());
				Double lado3Double = Double.parseDouble(textFieldLado3.getText());
				
				if((lado1!="")&&(lado2!="")&&(lado3!="")){
					
					if(esTriangulo(lado1Double,lado2Double,lado3Double)){
						
						lblResultado.setText("El área del triángulo es: "+(lado1Double*lado2Double)/2);
					
					}else{
						lblResultado.setText("No es un triángulo");
					}
				}
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalcular.setBounds(473, 110, 120, 20);
		contentPane.add(btnCalcular);
		
		//REINICIAR
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLado1.setText("");
				textFieldLado2.setText("");
				textFieldLado3.setText("");
				lblResultado.setText("El área del triángulo ");
			}
		});
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReiniciar.setBounds(473, 208, 120, 20);
		contentPane.add(btnReiniciar);
		
		
		
		//TEXTFIELD
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

	public void keyTyped(KeyEvent e) {
		
		textField = (JTextField) e.getSource();
	
		char c = e.getKeyChar();
		
		//Ignora el . si ya hay un . en el texto
		if (textField.getText().contains(".") && c == '.') {
		e.consume();
		} 
		
		//Ignora caracteres y borrados (gestiona el tema del punto tambien aunque se filtre arriba)
		if (!Character.isDigit(c) && c != '.') {
	    	  if (c != KeyEvent.VK_BACK_SPACE) {
	                JOptionPane.showMessageDialog(null, "Solo se permiten números");
	                e.consume();
	            }
	    }


	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private boolean esTriangulo(double a,double b, double c){
		return((a + b > c && a + c > b && b + c > a));
		
	}

	
}