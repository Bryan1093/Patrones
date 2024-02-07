package impl;

import Interfaces.ICommand;
import model.Receptor;

public class RehacerCommand implements ICommand {

	private Receptor receptor;
	
	public RehacerCommand(Receptor receptor) {
		this.receptor=receptor;
	}
	@Override
	public void ejecutar() {
		receptor.realizarRehacer();	
	}
}