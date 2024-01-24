package impl;

import Interfaces.IAprobador;

public class EjecutivoCuenta implements IAprobador{

	private IAprobador next;
	
	@Override
	public IAprobador getNext() {
		return next;
	}

	@Override
	public void solicitudPrestamo(int monto) {
		if(monto <= 10000) {
			System.out.println("Es mi responsabilidad atenderlo: Ejecutivo");
		}else {
			next.solicitudPrestamo(monto);
		}
	}

	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;
		
	}

}