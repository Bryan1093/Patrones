package Adapter;

import impl.Auto;
import impl.AutoHibrido;

public class AutoHibridoAdapter extends Auto{

	private AutoHibrido autoHibrido;
	
	public AutoHibridoAdapter() {
		System.out.println("Creando auto hibrido adaptado");
		System.out.println("...............");
		this.autoHibrido = new AutoHibrido();
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo por medio del adapter");
		this.autoHibrido.conectar();
		this.autoHibrido.activar();
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando por medio del adapter");
		this.autoHibrido.moverRapido();
	}

	@Override
	public void apagar() {
		System.out.println("Apagando por medio del adapter");
		this.autoHibrido.detener();
		this.autoHibrido.desconectar();
	}

}