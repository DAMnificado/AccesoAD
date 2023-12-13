package swing;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RojoAzul extends JFrame implements ActionListener {
	
	private JButton botonAzul;
	private JButton botonRojo;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RojoAzul frame = new RojoAzul();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RojoAzul() {
		
		setTitle("Cambio de Color de Fondo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		botonRojo = new JButton("rojo");
		botonRojo.setBounds(88, 25, 89, 23);
		contentPane.add(botonRojo);
		botonRojo.setBackground(Color.RED);
		botonRojo.addActionListener(this);
		
		botonAzul = new JButton("azul");
		botonRojo.setBounds(88, 25, 89, 23);
		contentPane.add(botonAzul);
		botonAzul.setBackground(Color.BLUE);
		botonAzul.addActionListener(this);
			
		botonAzul.setBounds(253, 25, 89, 23);
		contentPane.add(botonAzul);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == botonAzul) {
			contentPane.setBackground(Color.BLUE);
			botonRojo.setBackground(null);
			
		}
		
		if(e.getSource() == botonRojo) {
			contentPane.setBackground(Color.RED);
			botonAzul.setBackground(null);
		}
		
	}

}
