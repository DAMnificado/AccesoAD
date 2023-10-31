package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FrameEj_ManejadorBottones implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton=(JButton)e.getSource();
		if(boton.getName().equals("insultar")){
			System.out.println("HDP");
		}else if (boton.getName().equals("saludar")) {
			System.out.println("HOLA GUAPI");
		}
	}

}
