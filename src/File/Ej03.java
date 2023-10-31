package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ej03 {

//Crea un programa en Java que lea el contenido de un archivo  que indique el usuario
//y reemplace todas las ocurrencias de una
//	palabra por otra. Ambas palabras serán solicitadas al usuario.
//	El resultado debe guardarse en otro archivo de texto llamado "reemplazo.txt"

	public static void main(String[] args) {

		String archivo = JOptionPane.showInputDialog(null, "Dime el archivo que quieres remplazar");
		System.out.println("El usuario ingresó: " + archivo);

		File arc = new File(archivo);
		File remplazo = new File(".\\src\\remplazo.txt");

		// .\\src\\archivo.txt
		String palabraARemplazar = JOptionPane.showInputDialog(null, "Dime que palabra quieres remplazar");
		System.out.println("El usuario ingresó: " + palabraARemplazar);

		String palabraAEscribir = JOptionPane.showInputDialog(null, "Dime que palabra quieres escribir");
		System.out.println("El usuario ingresó: " + palabraAEscribir);

		String[] palabras;

		String linea;

		String frase = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(arc));

			while ((linea = br.readLine()) != null) {
				frase += linea + "\n";
			}

			br.close();

			palabras = frase.split("[\\s]");

			for (int i = 0; i < palabras.length; i++) {
				if (palabras[i].equals(palabraARemplazar)) {
					palabras[i] = palabraAEscribir;
				}
			}
			frase = String.join(" ", palabras);
			BufferedWriter bw = new BufferedWriter(new FileWriter(remplazo));
			bw.write(frase);
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
