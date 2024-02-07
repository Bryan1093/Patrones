package Interfaces;

public abstract class Figura {
	
	protected IColor color;

	public Figura(IColor c) {
		this.color=c;
	}
	public abstract void dibujarFigura(int borde);
	public abstract void modificarBorde(int borde, int incremento);
}
