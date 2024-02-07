package impl;

import Interfaces.IEstado;
import model.Mascota;

public class Hambriento implements IEstado{

private Mascota mascota;
	
	@Override
	public void jugar() {
		System.out.println("No quiero jugar, quiero comer");
	}

	@Override
	public void alimentar() {
		System.out.println("Siiiii, tenia mucha hambre oe");
		mascota.setEstado(new Aburrido());
	}

	@Override
	public void dormir() {
		System.out.println("No quiero dormir, tengo mucha hambre");
	}

	@Override
	public void estadoAnimo() {
		System.out.println("Estoy hambriento!!");
	}

	@Override
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
}
