package model;

import impl.ConcreteMediator;

public class App {
	public static void main(String[] args) {
		ConcreteMediator cMediador = new ConcreteMediator();
		AmigoUno alex = new AmigoUno(cMediador, "Alex");
		AmigoDos juan = new AmigoDos(cMediador, "Juan");
		Jefe  javy = new Jefe(cMediador, "Javy");
		
		cMediador.setAmigoUno(alex);
		cMediador.setAmigoDos(juan);
		cMediador.setJefe(javy);
		
		alex.enviar("-- Alex envio: -- Buen dia. Te molesto con un favor" );
		juan.enviar("-- Juan envio: -- Buen dia. con mucho gusto" );
		javy.notify("-- Javy envio: -- por favor trabajar en lugar de conversar!! ");
	}
}