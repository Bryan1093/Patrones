package impl;

import Interfaces.IObserver;

public class ObservadorTres implements IObserver{

	public ObservadorTres() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(String s, int i) {

		System.out.println("Observador Tres: mi valor en: " + s + "\nObservadores, el valor ha cambiado a:  " + i);
		
	}

}
