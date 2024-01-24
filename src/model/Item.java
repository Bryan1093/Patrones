package model;

public class Item {
	private int id;
	private int codigo;
	private double precio;

	public Item(int id, int codigo, double precio) {
		this.codigo = codigo;
		this.id = id;
		this.precio = precio;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}