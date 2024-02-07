package impl;

import Interfaces.IEstado;
import model.Mascota;

public class Cansado implements IEstado{

private Mascota mascota;
	
	@Override
	public void jugar() {
		System.out.println("No quiero jugar, estoy muy cansado");	
	}

	@Override
	public void alimentar() {
		System.out.println("No tengo hambre, estoy cansado");
	}

	@Override
	public void dormir() {
		System.out.println("Siiiiiiiiiii, tengo sueño, BUENAS NOCHES");
		mascota.setEstado(new Durmiendo());
	}

	@Override
	public void estadoAnimo() {
		System.out.println("Estoy muy cansado");
	}

	@Override
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
}
