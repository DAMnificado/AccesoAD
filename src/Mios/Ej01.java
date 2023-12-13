package Mios;

import javax.swing.*;
import java.io.*;

//Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero resultante
//aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, 
//la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc.

//-Los nombres de los dos ficheros origen y el nombre del fichero destino se deben pasarse por texto o bien emplear JFileChooser
//-Hay que tener en cuenta que los ficheros dedonde se van cogiendo las líneas pueden tener tamaños diferentes en cuanto al número de líneas.

public class Ej01 {

    public static void main(String[] args) {

        File archivo1=null;
        File archivo2=null;
        File destino=null;

        JFileChooser fc = new JFileChooser();

        JOptionPane.showMessageDialog(null, "Seleccione el primer archivo a combinar");

        int result = fc.showOpenDialog(null);
        if (result == fc.APPROVE_OPTION) {
            archivo1 = fc.getSelectedFile();
        }


        JOptionPane.showMessageDialog(null, "Seleccione el segundo archivo a combinar");
        result = fc.showOpenDialog(null);
        if (result == fc.APPROVE_OPTION) {
            archivo2 = fc.getSelectedFile();
        }


        JOptionPane.showMessageDialog(null, "Seleccione el archivo destino");
        result = fc.showOpenDialog(null);
        if (result == fc.APPROVE_OPTION) {
            destino = fc.getSelectedFile();
        }

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo1));
            BufferedReader lector2 = new BufferedReader(new FileReader(archivo2));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(destino,true));

            String linea1=lector.readLine();
            String linea2=lector2.readLine();

            while ( linea1!=null | linea2!=null  ){

                if (linea1!=null){
                    escritor.write(linea1 + "\n");
                    linea1=lector.readLine();
                }

                if (linea2!=null){
                    escritor.write(linea2 + "\n");
                    linea2=lector2.readLine();
                }
            }
            lector.close();
            lector2.close();
            escritor.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }





    }
}