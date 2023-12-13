package swing;

public class PerimetroPuntos {
	
	private double X;
	private double Y;
	
	public PerimetroPuntos(double x, double y) {
		this.X = x;
		this.Y = y;
	}
	
	public static double distancia2Puntos(PerimetroPuntos p1, PerimetroPuntos p2) {
		
		return Math.sqrt(Math.pow(p2.X - p1.X, 2) + Math.pow(p2.Y - p1.Y, 2));	
		
	}

}
