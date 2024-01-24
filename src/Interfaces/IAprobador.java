package Interfaces;

public interface IAprobador {

	public IAprobador getNext();
	public void solicitudPrestamo(int monto);
	public void setNext(IAprobador aprobador);
}