package Factory;

import impl.PayPal;
import impl.TarjetaCredito;
import impl.Transferencia;
import model.CarroCompras;
import model.Item;


public class App2 {
	public static void main(String[] args) {
		CarroCompras carro = new CarroCompras();
		
		Item it1 = new Item(1,101,121.30); 
		Item it2 = new Item(2,201,78.32); 
		Item it3 = new Item(3,301,45.37); 
		Item it4 = new Item(4,401,12.34); 
		
		carro.add(it1);
		carro.add(it2);
		carro.add(it3);
		carro.add(it4);
		carro.pagoO(new PayPal(" holiii@hotmail.com ", " 1254 "));
		carro.pagoO(new TarjetaCredito(" Jordy ", 145244548, 123, " 17/01/2023 "));
		carro.pagoO(new Transferencia(" Banco del Barrio ", 1234567425));
	}
}
