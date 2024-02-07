package model;

import java.util.ArrayList;

public class CareTaker {
	private Memento m;
	private ArrayList<Memento > estados = new ArrayList<>();
	
	public void almacenarMemento(Memento m ) {
		this.m=m;
	}
	
	public Memento recuperarMemento() {
		return m;
	}
	
	public void addMemento(Memento memento) {
	    estados.add(memento);
	}

	public Memento getMemento(int index) {
		return estados.get(index);
	}
}