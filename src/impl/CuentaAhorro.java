package impl;

import Interfaces.ICuentaBancaria;

public class CuentaAhorro implements ICuentaBancaria{

	@Override
	public void abrirCuenta(Cuenta c) {
		
		System.out.println("Se abre la cuenta de ahorros: "+ c.getId() + " del cliente: "+ c.getCliente());
		
	}

}
