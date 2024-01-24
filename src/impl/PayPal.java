package impl;

import Interfaces.IPago;

public class PayPal implements IPago {

	private String mail;
	private String contrasenia;

	public PayPal(String mail, String contrasenia) {
		this.contrasenia = contrasenia;
		this.mail = mail;
	}

	@Override
	public void pago(double monto) {
		System.out.println(" validando el email... ");
		System.out.println(" Espere un momento... ");
		System.out.println(" validad el email y contraseña, Procede al pago con Paypal: " + monto);
	}
}
