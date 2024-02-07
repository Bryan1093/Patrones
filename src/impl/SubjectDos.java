package impl;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IObserver;
import Interfaces.ISubject;

public class SubjectDos implements ISubject{

	private int valor;
	
	List<IObserver> observerList =
			new ArrayList<IObserver>();
	
	@Override
	public void register(IObserver o) {
		
		observerList.add(o);
		
	}

	@Override
	public void unregister(IObserver o) {
		
		observerList.remove(o);
		
	}

	@Override
	public void notifyObservers(int i) {
		
		for(var item: observerList) {
			item.update(this.getClass().getSimpleName(), i);
		}
		
		
	}
	
	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
		notifyObservers(valor);
	}

}
