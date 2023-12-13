package Bol1Ficheros;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

//Realizar un programa Java que pida el nombre de un directorio. 
//El programa deberá listar sus ficheros y después eliminar el directorio y los ficheros contenidos en él.

public class Directorios {
    public static void main(String[] args) {
        // Pedir al usuario el nombre del directorio
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del directorio a eliminar: ");
        String stringDirectorioAEliminar = scanner.nextLine();

        // Crear un objeto File con el nombre del directorio
        File directorio = new File(stringDirectorioAEliminar);

        // Verificar si el directorio existe
        if (directorio.exists() && directorio.isDirectory()) {
        	
            // Listar los archivos en el directorio
            String[] archivos = directorio.list();
            System.out.println("Archivos en el directorio:");
            Arrays.stream(archivos).forEach(System.out::println);

            // Eliminar cada archivo en el directorio
            for (String archivo : archivos) {
                File archivoAEliminar = new File(directorio, archivo);
                archivoAEliminar.delete();
            }

            // Eliminar el directorio
            if (directorio.delete()) {
                System.out.println("Directorio eliminado exitosamente.");
            } else {
                System.out.println("No se pudo eliminar el directorio.");
            }
        } else {
            System.out.println("El directorio no existe.");
        }
        
       
        // Cerrar el scanner
        scanner.close();
    }
}
