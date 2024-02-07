package model;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IPago;

public class CarroCompras {

	private List<Item> item = new ArrayList<>();

	public List<Item> getItem() {
		return item;
	}

	public void add(Item it) {
		if (it != null) {
			this.item.add(it);
		}
	}

	public void remove(Item it) {
		if (it != null) {
			this.item.remove(it);
		}
	}

	private double calTotal() {
		double suma = 0;

		for (var it : item) {
			suma += it.getPrecio();
		}
		return suma;
	}

	public void pagoO(IPago p) {
		double total = calTotal();
		p.pago(total);

	}
}