package FicherosBinarios;

import java.io.*;

public class Binarios2 {

	public static void main(String[] args) {
		// ESCRITURA DEL FICHERO	
		
		FileOutputStream fe = null;
		DataOutputStream ds = null;
		
		int [] arrayEnteros = {5, 18, 23, 12, 10, 1, 47};
		String [] arrayNombres = {"Beatriz", "Ana", "Maria", "Juan", "Pedro","Teresa",
		"Marta"};
		
		try {
			fe=new FileOutputStream("Fichero.dat",false);
			ds=new DataOutputStream(fe);
			
			for(int i=0;i<arrayEnteros.length;i++) {
				ds.writeInt(arrayEnteros[i]);
				ds.writeUTF(arrayNombres[i]);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				ds.close();
				fe.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		//EMPEZAMOS LA LECTURA
		
		
		 FileInputStream fis = null;
	       DataInputStream dis = null;
	       
	       try {
	           fis = new FileInputStream("fichero.dat");
	           dis = new DataInputStream(fis);

	           // while (true) ES POCO RECOMENDABLE, mejor usar available()
	           while (dis.available() != 0) {
	        	   System.out.println(dis.readInt());
	        	   System.out.println(dis.readUTF());
	           }
	       
	       	} catch (IOException e) {
	            System.out.println("No se pudo abrir el fichero");
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("No se pudo escribir en el fichero");
	        } finally {
	            try {
	                dis.close();
	                fis.close();
	            } catch (Exception e2) {
	                e2.printStackTrace();
	            }
	        }
	}
}
