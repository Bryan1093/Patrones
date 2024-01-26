package model;

public abstract class CuentaBancaria {

	private String cuenta;
	private int saldo;

	private void depositar(int val) {
		System.out.println("Depositando..." + val);
		this.saldo+= val;
	}

	private void retirar(int val) {

		System.out.println("Retirando.....");
		if(val <= this.saldo - 10) {
			this.saldo -= val;
		}else {
			System.out.println("Saldo insuficiente para realizar esta transacción");
		}
	}

	private void consultarSaldo() {

		System.out.println("El saldo actual de su cuenta es: "+ this.saldo);
	}

	protected void auditoria() {

		System.out.println("Se ha procesado su transacción en la cuenta: " + this.cuenta);
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public abstract void confirmar();
	public void procesar(String c, int val, int tipo) {

		confirmar();
		setCuenta(c);

		switch(tipo) {
			case 1:
				depositar(val);
				break;
			case 2:
				retirar(val);
				break;
			default:
				System.out.println("Transacción no valida");
		}
		consultarSaldo();
		auditoria();
	}

}
