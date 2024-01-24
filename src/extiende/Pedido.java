package extiende;

import Interfaces.IPrecio;
import impl.ProductoCompuesto;
import impl.ProductoPeso;
import impl.ProductoUnitario;

public class Pedido extends ProductoCompuesto{

	private String cliente;
	
	public Pedido(String cli) {
		this.cliente=cli;
	}
	
	public void addProducto(IPrecio pro) {
		super.addProducto(pro);
	}
	
	public void removeProducto(IPrecio pro) {
		super.removeProducto(pro);
	}
	
	public void establecerCantidad(IPrecio pro, int cantidad) {
		if(pro instanceof ProductoUnitario) {
			ProductoUnitario prodUnit = (ProductoUnitario)pro;
			prodUnit.setCantidad(cantidad);
		}
	}
	
	public void establecerPrecio(IPrecio pro, double peso) {
		if(pro instanceof ProductoPeso) {
			ProductoPeso prodPes = (ProductoPeso)pro;
			prodPes.setPeso(peso);
		}
	}
}