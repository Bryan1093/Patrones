package impl;

import Interfaces.ICommand;
import model.Receptor;

public class DeshacerCommand implements ICommand {

	private Receptor receptor;
	
	public DeshacerCommand(Receptor receptor) {
		this.receptor=receptor;
	}
	@Override
	public void ejecutar() {
		receptor.realizarDeshacer();	
	}

}
