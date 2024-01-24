package model;

import java.util.Random;

import Factory.EmpleadoFabrica;
import Interfaces.IEmpleado;

public class Ingenieria {

	static String empleadosTipo[] = {"Desarrollador", "Tester"};
	static String habilidades[] = {"Java", "Net","C++"};
	
	public static void main(String[] args) {
		
		for (int i =0; i<10; i++) {
			IEmpleado em= EmpleadoFabrica.getIEmpleado(getRandomEmpleado());
			em.habilidadAsignada(getRandomHabilidad());
			em.task();
		}
		
	}
	
	public static String getRandomEmpleado() {
			Random r = new Random();
			int rInt = r.nextInt(empleadosTipo.length);
			return empleadosTipo[rInt];
	}
	
	public static String getRandomHabilidad() {
		Random r = new Random();
		int rInt = r.nextInt(habilidades.length);
		return habilidades[rInt];
}
}
