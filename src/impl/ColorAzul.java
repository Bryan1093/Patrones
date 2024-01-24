package impl;

import Interfaces.IColor;

public class ColorAzul implements IColor{

	@Override
	public void pintar(int borde) {
		System.out.println(" Se pinta de color azul con un borde: "+ borde + " cm.");
		
	}

}