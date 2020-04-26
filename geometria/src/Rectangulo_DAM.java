/**
 * @author $danaska alonso
 *
 * $version 1.2
 */

public class Rectangulo_DAM extends FiguraGeometrica_DAM {
	private double l1;
	private double l2;
	
	//Dibuja el rectángulo
	
	public Rectangulo_DAM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	//Calcula el área

	@Override
	public double area() {
		return l1 * l2;
	}
	
	//Calcula el perímetro
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
