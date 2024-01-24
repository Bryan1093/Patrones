package impl;

import Interfaces.IPago;

public class TarjetaCredito implements IPago {

	private String nombre;
	private int numCard;
	private int cvv;
	private String FechaExperacion;

	public TarjetaCredito(String nom, int num, int cvv, String date) {
		this.cvv = cvv;
		this.FechaExperacion = date;
		this.nombre = nom;
		this.numCard = num;
	}

	@Override
	public void pago(double monto) {
		System.out.println(" Cliente: " + nombre + " realizo un pago por: " + monto + " con la tarjeta terminada en: "
				+ numCard % 1000 + " con la tarjeta terminada en : XXXX");

	}
}
