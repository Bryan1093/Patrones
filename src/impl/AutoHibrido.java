package impl;

public class AutoHibrido{
	
	private boolean conectado = false;
	
	public AutoHibrido() {
		System.out.println("AUTO HIBRIDO CREADO");
		this.conectado=false;
	}
	
	public void conectar() {
		System.out.println("Conectando bateria electrica");
		this.conectado=true;
	}
	
	public void activar() {
		if(conectado) {
			System.out.println("Activando el auto hibrido");
		}else {
		System.out.println("No esta activada la bateria electrica");
		}
	}
	
	public void moverRapido() {
		if(conectado) {
			System.out.println("Activando el auto hibrido");
			System.out.println(".............. acelerando");
		}else {
		System.out.println("El carro acelera por que solo esta con motor mecanico");
		}
	}
	
	public void detener() {
		if(this.conectado) {
			System.out.println("Deteniendo el motor");
		
		}else {
		System.out.println("Debemos cambiar a motor electrico.......");
		System.out.println("deteniendo");
		}
	}
	
	public void desconectar() {
		this.conectado=false;
		System.out.println("Desconectando motor mecanico y electrico");
	}
}
