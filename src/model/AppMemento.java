package model;

public class AppMemento {
	public static void main(String[] args) {
		Originador o = new Originador();
		o.setEstado("Mary");
		CareTaker c = new CareTaker();
		
		c.almacenarMemento(o.salvarMemento());
		o.setEstado("Maria");

		o.revertir(c.recuperarMemento());
		c.addMemento(o.salvarMemento());

		o.setEstado("Juan");
		c.addMemento(o.salvarMemento());

		o.setEstado("Carlos");
		c.addMemento(o.salvarMemento());
		
		Memento m1 = c.getMemento(0);
		Memento m2 = c.getMemento(1);
		
	}
}