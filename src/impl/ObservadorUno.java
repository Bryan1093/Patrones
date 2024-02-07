package impl;

import Interfaces.IObserver;

public class ObservadorUno implements IObserver{

	public ObservadorUno() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(String s, int i) {

		System.out.println("Observador Uno: mi valor en: " + s + "\nObservadores, se medificó a:  " + i);
		
	}

}
