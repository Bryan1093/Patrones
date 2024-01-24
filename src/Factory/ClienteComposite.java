package Factory;

import extiende.Pedido;
import impl.ProductoCompuesto;
import impl.ProductoPeso;
import impl.ProductoUnitario;

public class ClienteComposite {
	public static void main(String[] args) {
		Pedido pedido = new Pedido("Anita");
		
		ProductoPeso jamon = new ProductoPeso(1.7, 3.5, "Jamon", "Embutidos");
		ProductoPeso arroz = new ProductoPeso(2.9, 4.1, "Arroz", "Granos");
		ProductoPeso pavo = new ProductoPeso(10.8, 8.6, "Pavo", "Carnes");
		ProductoPeso zanahoria = new ProductoPeso(0.8, 1.5, "Zanahoria", "Vegetales");
		ProductoPeso carne = new ProductoPeso(2.8, 6.1, "Carne", "Carnes");
		ProductoPeso pollo = new ProductoPeso(5.4, 7.6, "Pollo", "Carnes");
		ProductoUnitario cola = new ProductoUnitario(10, 3, "Cola Cola", "Bebidas");
		ProductoUnitario aceite = new ProductoUnitario(15, 2.5, "Aceite Girasol", "Aceites");
		ProductoUnitario caramelos = new ProductoUnitario(14854, 0.5, "Caramelos de fresa", "Golosinas");
		ProductoCompuesto canasta = new ProductoCompuesto();
		canasta.addProducto(arroz);
		canasta.addProducto(pavo);
		canasta.addProducto(cola);

		pedido.addProducto(jamon);	
		pedido.addProducto(pollo);	
		pedido.addProducto(aceite);	
		pedido.addProducto(zanahoria);	
		pedido.addProducto(caramelos);	
		pedido.addProducto(canasta);	
		System.out.println("El costo de su compra es: "+ pedido.getImporteTotal());
	}
}