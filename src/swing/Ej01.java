package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ej01 extends JFrame {

	private JPanel contentPane;
	private JButton botonRojo;
	private JButton botonAzul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej01_swing frame = new Ej01_swing();
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
	public Ej01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		botonRojo = new JButton("");
		botonRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.RED);
			}
		});
		botonRojo.setBackground(Color.RED);
		botonRojo.setBounds(98, 197, 175, 70);
		contentPane.add(botonRojo);
		
		botonAzul = new JButton("");
		botonAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.BLUE);
			}
		});
		botonAzul.setBackground(Color.BLUE);
		botonAzul.setBounds(338, 197, 175, 70);
		contentPane.add(botonAzul);
	}
}
