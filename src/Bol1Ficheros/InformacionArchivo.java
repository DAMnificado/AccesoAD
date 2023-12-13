package Bol1Ficheros;

import java.io.File;

import javax.swing.JOptionPane;

public class InformacionArchivo {

	public static void main(String[] args) {
		String nombreAbuscar=JOptionPane.showInputDialog(null, "Introduzca el nombre del fichero");
		File ficheroBuscado=new File(nombreAbuscar);
		
		if (ficheroBuscado.exists()) {
			System.out.println("Nombre: "+ficheroBuscado.getName());
			System.out.println("Se puede modificar: "+ficheroBuscado.canWrite());
			System.out.println("Oculto: "+ficheroBuscado.isHidden());
			System.out.println("Tamaño: "+ficheroBuscado.length());
			System.out.println("Ultima modificación: "+ficheroBuscado.lastModified());
			System.out.println("Ubicación: "+ficheroBuscado.getAbsolutePath());
			System.out.println("Tamaño en bytes: "+ficheroBuscado.length());
			}
	}


}
