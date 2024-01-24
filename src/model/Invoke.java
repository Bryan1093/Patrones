package model;

import Interfaces.ICommand;

public class Invoke {

	ICommand cmd;
	public void ejecuteCommand(ICommand cmd) {
		this.cmd  = cmd;
		cmd.ejecutar();
	}
}