package swing;

	import java.awt.EventQueue;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.List;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JList;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.border.EmptyBorder;

	public class EjemploJList extends JFrame {

		private JPanel contentPane;
		private JList jlist;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						EjemploJList frame = new EjemploJList();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public EjemploJList() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			//Creamos un array con los elementos que tendrá la lista
			String [] alumnos= {"Pedro","Juana","María"};
			//Etablecemos mediante setListData un nuevo array a la lista
			String [] alumnos2= {"Pedro","Juana","María","Fran"};
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(49, 37, 134, 172);
			contentPane.add(scrollPane);
			
			JList list = new JList(alumnos);
			scrollPane.setViewportView(list);
			list.setListData(alumnos2);
			
			JButton btnNewButton = new JButton("Obtener Elementos");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 List<String> selectedAlumnos = list.getSelectedValuesList();
		                for (String alumno : selectedAlumnos) {
		                    System.out.println(alumno);
		                }
				}
			});
			
			btnNewButton.setBounds(59, 229, 89, 23);
			contentPane.add(btnNewButton);
			
			
			//EJEMPLO CON ARRAYLIST, ÚTIL CUANDO SE QUIERA MODIFICAR
			//LOS ELEMENTOS DE LA LISTA
			
			List<String> lista = new ArrayList<>();
	        lista.add("Item 1");
	        lista.add("Item 2");
	        lista.add("Item 3");
			lista.add("Item 4");
			
            JScrollPane scrollPane_1 = new JScrollPane();
            scrollPane_1.setBounds(222, 42, 113, 74);
            contentPane.add(scrollPane_1);
         
	        // Creamos un JList con los elementos del arraylist "lista"
            jlist = new JList<>(lista.toArray());
            scrollPane_1.setViewportView(jlist);
            jlist.setVisibleRowCount(15);
            jlist.setListData(lista.toArray());
			
        	JButton btnNewButton_1 = new JButton("Añadir elemento");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nuevoElemento = JOptionPane.showInputDialog("Nuevo elemento");
					lista.add(nuevoElemento);
					jlist.setListData(lista.toArray());

					}
			});
			btnNewButton_1.setBounds(228, 229, 89, 23);
			contentPane.add(btnNewButton_1);
			
			
			
			     
			
			
		}
		public JList getList_1() {
			return jlist;
		}
	}

