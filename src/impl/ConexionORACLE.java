package impl;

import java.util.Properties;

import Interfaces.Conexion;


public class ConexionORACLE implements Conexion{
	private static ConexionORACLE instancia; 
	private Properties p;
	
	private ConexionORACLE() {
		p = getProperties();
		
	}
	
	public static ConexionORACLE getInstacia() {
		if(instancia == null) {
			instancia = new ConexionORACLE();
		}else {
			System.out.println("Se devuelve la instancia existente");
			System.out.println("Metodo Factory Correcto!");
		}
		return instancia;
	}
	
	@Override
	public String getPropiedad1(String usuario) {
		return p.getProperty(usuario);
	}
	
	@Override
	public String getPropiedad2(String contrasenia) {
		return p.getProperty(contrasenia);
	}
	
	@Override
	public String getPropiedad(String clave) {
		return p.getProperty(clave);
	}
}
