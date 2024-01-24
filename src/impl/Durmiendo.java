package impl;

import java.util.Timer;
import java.util.TimerTask;

import Interfaces.IEstado;
import model.Mascota;

public class Durmiendo implements IEstado{

private Mascota mascota;
	
	@Override
	public void jugar() {
		System.out.println("Shhhhh mmvg");	
	}

	@Override
	public void alimentar() {
		System.out.println("Shhhhh mmvg");
	}

	@Override
	public void dormir() {
		System.out.println("Shhhhh mmvg");
	}

	@Override
	public void estadoAnimo() {
		System.out.println("Esta durmiendo!!!");
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Durmiendo.this.mascota.setEstado(new Hambriento());
			}
		}, 6000);
		System.out.println("Ya estoy despierto, vamos a jugar");
	}

	@Override
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
}
