package impl;

import Interfaces.IExpresion;
import model.Contexto;


public class IntToWords implements IExpresion{

	private String str;
	
	public IntToWords(String str) {
		this.str=str;
	}
	@Override
	public void interprete(Contexto ic) {
		ic.imprimirEnPalabras(str);
	}

}