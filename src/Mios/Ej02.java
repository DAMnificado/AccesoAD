package Mios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

// Realiza un programa en Java donde introduzcas la ruta de un fichero por teclado y un texto que queramos a escribir 
// en el fichero con JOptionPane.showInputDialog Posteriormente, muestra el contenido del fichero.

// Haz una versión alternativa empleando JFileChooser

public class Ej02 {

	public static void main(String[] args) {
		
		String ruta = JOptionPane.showInputDialog(null, "Dime una ruta");
		System.out.println("El usuario ingresó: " + ruta);

		String texto = JOptionPane.showInputDialog(null, "Que quieres escribir");
		System.out.println("El usuario ingresó: " + texto);
		
		
		File archivo = new File(ruta);
		try {
			FileWriter fw = new FileWriter(archivo);
			fw.write(texto);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
