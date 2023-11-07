package swing;

public class Ej04_Punto {
	private double X;
	private double Y;
	
	public Ej04_Punto(double x, double y) {
		this.X = x;
		this.Y = y;
	}
	
	public static double distancia2Puntos(Ej04_Punto p1, Ej04_Punto p2) {
		
		return Math.sqrt(Math.pow(p2.X - p1.X, 2) + Math.pow(p2.Y - p1.Y, 2));	
		
	}

}
