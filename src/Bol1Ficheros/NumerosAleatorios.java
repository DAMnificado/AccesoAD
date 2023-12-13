package Bol1Ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//Crea un programa que pida por teclado la ruta de un fichero y la cantidad de números
//aleatorios que queremos generar. Los números generados se guardarán en el fichero usando
//DataOutputStream, en otro método los leeremos del fichero utilizando DataInputStream y los
//mostraremos en pantalla.
//El rango de los números aleatorios estará entre 0 y 100, incluyendo el 100.
//Cada vez que ejecutemos la aplicación añadiremos números al fichero sin borrar los anteriores,
//es decir, si creo el fichero añadiendo 10 números y después añadimos otros 10, al final el
//fichero habrá 20 números que se mostrarán por pantalla.

public class NumerosAleatorios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta del fichero: ");
        String rutaArchivo = scanner.nextLine();

        System.out.print("Introduce la cantidad de números aleatorios a generar: ");
        int cantidadNumeros = scanner.nextInt();

        generarNumeros(rutaArchivo, cantidadNumeros);
        leerYMostrarNumeros(rutaArchivo);
    }

    private static void generarNumeros(String rutaArchivo, int cantidadNumeros) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(rutaArchivo, true))) {
            Random random = new Random();

            for (int i = 0; i < cantidadNumeros; i++) {
                int numeroAleatorio = random.nextInt(101); // Rango entre 0 y 100 (incluyendo el 100)
                dos.writeInt(numeroAleatorio);
            }

            System.out.println("Números aleatorios generados y escritos en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leerYMostrarNumeros(String rutaArchivo) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(rutaArchivo))) {
            System.out.println("Números almacenados en el archivo:");

            while (dis.available() > 0) {
                int numeroLeido = dis.readInt();
                System.out.println(numeroLeido);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
