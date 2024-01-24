package model;

import abs.Amigos;
import abs.Mediator;

public class Jefe extends Amigos{

	public Jefe(Mediator mediator, String nombre) {
		super(mediator);
		this.name = nombre;
	}

	@Override
	public void enviar(String mns) {
		mediator.enviar(this, mns);
	}

	@Override
	public void notify(String mns) {
		System.out.println(" El jefe esta viendo el mensaje: "+ mns);
	}

}