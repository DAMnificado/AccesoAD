package FicherosBinarios;

import java.io.*;

public class Binarios1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		File fichero=new File("fichero.dat");
		int [] numeros= {1,2,3,4,5,6,7,8,9,10};
		
		try {
			fos=new FileOutputStream(fichero,false);
			dos=new DataOutputStream(fos);
			for(int numero:numeros) {
				dos.writeInt(numero);
			}
		}catch(IOException e) {
			System.out.println("No se pudo escribir en el fichero");
		}catch (Exception e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				dos.close();
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
		}
		
		

	}

}
