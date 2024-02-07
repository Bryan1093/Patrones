package model;

import abs.Amigos;
import abs.Mediator;

public class AmigoDos extends Amigos{

	public AmigoDos(Mediator mediator, String nombre) {
		super(mediator);
		this.name = nombre;
	}

	@Override
	public void enviar(String mns) {
		mediator.enviar(this, mns);
	}

	@Override
	public void notify(String mns) {
		System.out.println(this.name + " recibe un mensaje: "+ mns);
	}
}
