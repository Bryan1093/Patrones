package impl;

import Interfaces.IAprobador;

public class Director implements IAprobador{

	private IAprobador next;
	@Override
	public IAprobador getNext() {
		return next;
	}

	@Override
	public void solicitudPrestamo(int monto) {
		
		EjecutivoCuenta ejecutivo = new EjecutivoCuenta();
		this.setNext(ejecutivo);
		
		LiderEjecutivo lider = new LiderEjecutivo();
		ejecutivo.setNext(lider);
		
		Gerente gerente = new Gerente();
		lider.setNext(gerente);
		
		Director director = new Director();
		gerente.setNext(director);
		
		next.solicitudPrestamo(monto); //aqui next, es el ejecutivo
	}

	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;	
	}

}