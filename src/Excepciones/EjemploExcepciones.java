package Excepciones;

import java.util.Scanner;

public class EjemploExcepciones  {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		try{
			recibirNumero(numero);
		}catch(ExcepcionNumeroGrande e){
			System.out.println(e.getMessage());
		}
		
	}	
	
	public static void recibirNumero(int numero)throws ExcepcionNumeroGrande{
		if (numero>10) {
			throw new ExcepcionNumeroGrande("El numero es mayor que 10");
		}else
		{
			System.out.println("Has introducido un "+numero);
		}
	}
}