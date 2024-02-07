package model;

public class Cajero extends CuentaBancaria{

	public Cajero(String cuenta, int val, int tipo) {
		procesar(cuenta,val,tipo);
	}

	@Override
	public void confirmar() {

		System.out.println("Confirmando documentos de identidad");

	}

	@Override
	public void auditoria() {

		super.auditoria();
		System.out.println("Se ha actualizado su cartilla, un buen dia");
	}

}
