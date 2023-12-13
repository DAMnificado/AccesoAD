package swing;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;



public class FotosCoche extends JFrame{
	
	private JPanel contentPane;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FotosCoche frameFotos = new FotosCoche();
					frameFotos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FotosCoche() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		String [] coches= {"Golf","Ferrari","Mercedes"};
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 31, 112, 145);
		contentPane.add(scrollPane);
		
	
		JList listaCoches = new JList(coches);
		scrollPane.setViewportView(listaCoches);
		listaCoches.setListData(coches);
		
	}
	
	
}
