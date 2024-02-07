package impl;

import Interfaces.IPago;

public class Transferencia implements IPago {

	private String banco;
	private int cuenta;

	public Transferencia(String banco, int cuenta) {
		// TODO Auto-generated constructor stub
		this.banco = banco;
		this.cuenta = cuenta;
	}

	@Override
	public void pago(double monto) {
		// TODO Auto-generated method stub
		System.out.println(" Verificando monto...");
		System.out.println(" Realizando la transferencia por el banco: " + banco + " con el monto: " + monto);
	}
}