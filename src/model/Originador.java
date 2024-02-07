package model;

public class Originador {
	private String estado;
	Memento m;

	public Memento salvarMemento() {
		m = new Memento(estado);
		return m;
	}

	public void revertir(Memento m) {
		System.out.println("Restaurante al estado anterior....");
		estado = m.getSalvaEstado();
		System.out.println("Estado modificado a: "+ estado);
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
		System.out.println("Estado actual: "+ estado);
	}

	public Memento getM() {
		return m;
	}

	public void setM(Memento m) {
		this.m = m;
	}

}