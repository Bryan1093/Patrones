package impl;

public class Cuenta {
	private int id;
	private String cliente;
	
	public Cuenta(int id, String cliente) {
		this.id=id;
		this.cliente=cliente;
	}
	
	public void abrirCuenta() {
		System.out.println("Cuenta abierta del cliente: "+ this.cliente);
	}
	
	public void consultarCuenta() {
		System.out.println("La cuenta del cliente es: "+ this.cliente);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
