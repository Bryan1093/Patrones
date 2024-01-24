package Facade;

import impl.ComputadorMainboard;
import impl.ComputadorMemoria;
import impl.ComputadorProcesador;

public class ComputadorFacade {

	private ComputadorMainboard cm;
	private ComputadorMemoria compMem;
	private ComputadorProcesador comProc;
	
	public ComputadorFacade() {
		this.compMem = new ComputadorMemoria();
		this.cm = new ComputadorMainboard();
		this.comProc = new ComputadorProcesador();	
	}


	public void constComputador(String disco, String procesador) {
		
		System.out.println("Ensamblaje inicializado......");
		
		this.compMem.setDisco(disco);
		this.cm.CrearMainBoard();
		this.comProc.setProcesador(procesador);
		
		System.out.println("Ensamblaje completado exitosamente!");
	}
}
