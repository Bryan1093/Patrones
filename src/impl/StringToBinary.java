package impl;

import Interfaces.IExpresion;
import model.Contexto;

public class StringToBinary implements IExpresion{

	private String str;
	
	public StringToBinary(String str) {
		this.str=str;
	}
	@Override
	public void interprete(Contexto ic) {
		ic.getBinaryForm(str);
	}

}