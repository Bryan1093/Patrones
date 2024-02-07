package Factory;

import model.Mascota;
import java.awt.DisplayMode;
import java.util.Scanner;

public class Menu {

	private Mascota mascota = new Mascota();
	
	public Menu(Mascota mascota) {
		this.mascota = mascota;
	}
	
	public void display() {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		String mns ="Escoger: 1. alimentar, 2. Dormir, 3. Jugar, 4. Ver estado, 5. Salir";
		
		do {
			System.out.println(mns);
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				mascota.alimentar();
				break;
			case 2:
				mascota.dormir();
				break;
			case 3:
				mascota.jugar();
				break;
			case 4:
				mascota.estadoAnimo();
				break;
			case 5:
				System.out.println("Adios");
				System.exit(0);
				break;
				default:
					System.out.println("ERROR....Opcion no valida! ");
					break;
			}
		}while(op!=5);
		
	}
}
