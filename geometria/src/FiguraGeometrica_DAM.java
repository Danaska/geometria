
public abstract class FiguraGeometrica_DAM {

	protected String tipoFigura;

	public FiguraGeometrica_DAM(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}

	public abstract double area();
	
	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
