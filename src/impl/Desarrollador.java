package impl;

import Interfaces.IEmpleado;

public class Desarrollador implements IEmpleado{

	private final String JOB;
	private String habilidad;
	
	public Desarrollador() {
		
		JOB = "Desarrollo  y solucionar problemas detectados por los Testers";
	}

	@Override
	public void habilidadAsignada(String habilidad) {
		
		this.habilidad = habilidad;
		
	}
	
	@Override
	public void task() {
		
		System.out.println("Desarrollador con habilidades de :" + this.habilidad 
				+ " con tarea asignada de: " + JOB);
		
	}
}
