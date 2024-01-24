package impl;

import abs.Amigos;
import abs.Mediator;
import model.AmigoDos;
import model.AmigoUno;
import model.Jefe;

public class ConcreteMediator implements Mediator {
	private AmigoDos amigoDos;
	private AmigoUno amigoUno;
	private Jefe jefe;

	@Override
	public void enviar(Amigos am, String mns) {
		if (am.equals(amigoUno)) {
			amigoDos.notify(mns);
			jefe.notify(" Le envio un mensaje:" + amigoUno.name + " a: " + amigoDos.name);
		}
		if (am.equals(amigoDos)) {
			amigoUno.notify(mns);
			jefe.notify(" Le ha enviado un mensaje: " + amigoDos.name + " a: " + amigoUno.name);
		}
		if (am.equals(jefe)) {
			amigoUno.notify(mns);
			amigoDos.notify(mns);
		}
	}

	public AmigoDos getAmigoDos() {
		return amigoDos;
	}

	public void setAmigoDos(AmigoDos amigoDos) {
		this.amigoDos = amigoDos;
	}

	public AmigoUno getAmigoUno() {
		return amigoUno;
	}

	public void setAmigoUno(AmigoUno amigoUno) {
		this.amigoUno = amigoUno;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}
}