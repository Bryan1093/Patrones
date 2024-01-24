package impl;

import Interfaces.Figura;
import Interfaces.IColor;

public class Rectangulo extends Figura{

	public Rectangulo(IColor c) {
		super(c);
		
	}

	@Override
	public void dibujarFigura(int borde) {
		System.out.println("Este rectangulo se esta pintando con el color: ");
		color.pintar(borde);
	}

	@Override
	public void modificarBorde(int borde, int incremento) {
		System.out.println("Este rectangulo ha modificado su borde con: " + incremento + " veces mas ancho");
		borde *= incremento;
		dibujarFigura(borde);		
	}

}