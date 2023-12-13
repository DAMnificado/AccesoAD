package Repaso;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ej1 {
	
	//Crea un directorio con el nombre especificado en la ruta src con mkdir(). Luego, en funcion del numArchivos 
	//crea un bucle para crear dentro de ese directorio tantos archivos como se hayan especificado. Con el nombre archivo0, archivo1, etc. 
	//Luego haz un filechooser, para que se pueda hacer seleccion multiple, dile que el directorio
	//default es el directorio que acabes de crear, y le ponle un filtro para que solo coja archivos de txt.
	//Despues guardo los selectedFiles en un array de Files[]. Si no esta vacio, lo recorro y elimino los archivos seleccionados.

	public static File crearDirectorio(String name, int numArchivos) throws IOException {

		//con el .\\src\\ y el nombre del directorio proporcionado le das un nombre al directorio en sí
		String nombreDirectorio = ".\\src\\" + name;

		//aqui lo creas
		File directorio = new File(nombreDirectorio);
		directorio.mkdir();
		
		//declaramos archivo
		File file;
		
		for (int i = 0; i < numArchivos; i++) {

			String nombreArchivo = nombreDirectorio + "\\archivo" + i + ".txt";
			file = new File(nombreArchivo);
			file.createNewFile();
			System.out.println(file.getName());

		}

		return directorio;

	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el nombre de tu directorio: ");
		String nombre = sc.nextLine();

		//crea el directorio con el numero de archivos que quieras
		File directorio = crearDirectorio(nombre, 3);

		JFileChooser fc = new JFileChooser();
		
		//permito elegir mas de uno
		fc.setMultiSelectionEnabled(true);
		//establezco el directorio que me han pasado como current directory
		fc.setCurrentDirectory(directorio);
		//aplico el filtro
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
		fc.setFileFilter(filter);
		
		
		int num = fc.showOpenDialog(null);

		File[] archivos = null;
		if (num == JFileChooser.APPROVE_OPTION) {

			archivos = fc.getSelectedFiles();

			if (archivos.length != 0 && archivos != null) {
				for (File archivo : archivos) {
					if (!archivo.delete()) {
						System.out.println("El archivo no se puede eliminar.");
					} else
						System.out.println("Archivo eliminado.");
				}

			}
		}
	}
}
