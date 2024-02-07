package impl;

import Interfaces.IAprobador;

public class Gerente implements IAprobador{

	private IAprobador next;
	@Override
	public IAprobador getNext() {
		return next;
	}

	@Override
	public void solicitudPrestamo(int monto) {
		if(monto > 50000 && monto <= 100000) {
			System.out.println("Me corresponde gestionar la solicitud: Gerente");
		}else {
			next.solicitudPrestamo(monto);
		}
	}

	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;	
	}

}
