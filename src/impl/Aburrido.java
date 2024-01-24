package impl;

import Interfaces.IEstado;
import model.Mascota;

public class Aburrido implements IEstado{

	private Mascota mascota;
	
	@Override
	public void jugar() {
		System.out.println("Yeahhhh.....Vamos a jugar mmvg");
		mascota.setEstado(new Cansado());
	}

	@Override
	public void alimentar() {
		System.out.println("No chucha, no quiero comer nada!!");
	}

	@Override
	public void dormir() {
		System.out.println("No mrda, no quiero dormir!!");
	}

	@Override
	public void estadoAnimo() {
		System.out.println("No me vez mmvg??? Estoy aburrido!!");
	}

	@Override
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

}
