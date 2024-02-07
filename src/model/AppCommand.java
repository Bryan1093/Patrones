package model;

import impl.DeshacerCommand;
import impl.RehacerCommand;

public class AppCommand {

	public static void main(String[] args) {
		Receptor r = new Receptor();
		Invoke inv = new Invoke();
		RehacerCommand re = new RehacerCommand(r);
		DeshacerCommand dc = new DeshacerCommand(r);
		inv.ejecuteCommand(dc);
		inv.ejecuteCommand(re);
	}
}