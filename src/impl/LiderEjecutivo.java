package impl;

import Interfaces.IAprobador;

public class LiderEjecutivo implements IAprobador{

	private IAprobador next;
	@Override
	public IAprobador getNext() {
		return next;
	}

	@Override
	public void solicitudPrestamo(int monto) {
		if(monto > 10000 && monto <= 50000) {
			System.out.println("El monto esta en mi rango, yo lo atiendo: Lider Ejecutivo");
		}else {
			next.solicitudPrestamo(monto);
		}
	}

	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;	
	}

}