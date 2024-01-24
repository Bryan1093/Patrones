package impl;

import Interfaces.ICuentaBancaria;

public class CuentaCorriente implements ICuentaBancaria{

	@Override
	public void abrirCuenta(Cuenta c) {
		
		System.out.println("Se abre la cuenta corriente: "+ c.getId() + " del cliente: "+ c.getCliente());
		
	}

}
