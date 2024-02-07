package impl;

import Interfaces.ICuentaBancaria;

public abstract class CuentaDecorator implements ICuentaBancaria{


	protected ICuentaBancaria cuentaDecorator;

	public CuentaDecorator(ICuentaBancaria cta) {
		this.cuentaDecorator=cta;
	}
	
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorator.abrirCuenta(c);
	}
}
