package impl;

import Interfaces.IEmpleado;

public class Tester implements IEmpleado{

	private final String JOB;
	private String habilidad;
	
	public Tester() {
		JOB = "Probar los sistemas para detectar problemas";
	}
	@Override
	public void habilidadAsignada(String habilidad) {
		
		this.habilidad= habilidad;
		
	}

	@Override
	public void task() {

		System.out.println("Tester tiene la habilidad de " +this.habilidad 
				+ " con la tarea asignada de " + JOB);
	}

}
