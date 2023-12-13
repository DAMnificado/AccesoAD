package Excepciones;

public class EjemploExcepcion {

	public static void main(String[] args) throws ArithmeticException {
		
		int num1 = 10;
		int num2=0;
		if (num2==0) {
			throw new ArithmeticException("No se puede dividir entre 0");
		}
		else
			System.out.println(num1/num2);
	}
	
	
	

}