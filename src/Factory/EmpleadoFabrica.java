package Factory;

import java.util.HashMap;

import Interfaces.IEmpleado;
import impl.Desarrollador;
import impl.Tester;

public class EmpleadoFabrica {

	private static HashMap<String, IEmpleado> emp = new HashMap<String, IEmpleado>();
	
	public static IEmpleado getIEmpleado(String tipo) {
		IEmpleado p = null;
		
		if(emp.get(tipo) != null) {
			p=emp.get(tipo);
		}else {
			switch(tipo) {
			case "Desarrollador":
				p = new Desarrollador();
				System.out.println("Desarrollador creado!");
				break;
			case "Tester":
				p = new Tester();
				System.out.println("Tester creado!");
				break;
				default:
					System.out.println("No existete ese tipo de empleado");
			}
			emp.put(tipo,p);
		}
		return p;
	}
}
