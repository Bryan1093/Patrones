package impl;

import Interfaces.IColor;

public class ColorVerde implements IColor{

	@Override
	public void pintar(int borde) {
		System.out.println(" Se pinta de color verde con un borde: "+ borde + " cm.");
		
	}

}