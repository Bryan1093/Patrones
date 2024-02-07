package impl;

import java.util.Properties;

import Interfaces.Conexion;


public class ConexionPostgres implements Conexion{
	private static ConexionPostgres instancia; 
	private Properties p;
	
	private ConexionPostgres() {
		p = getProperties();
		
	}
	
	public static ConexionPostgres getInstacia() {
		if(instancia == null) {
			instancia = new ConexionPostgres();
		}else {
			System.out.println("Se devuelve la instancia existente");
			System.out.println("Metodo Factory Correcto!");
		}
		return instancia;
	}

	@Override
	public String getPropiedad1(String usuario) {
		// TODO Auto-generated method stub
		return p.getProperty(usuario);
	}
	
	@Override
	public String getPropiedad2(String contrasenia) {
		return p.getProperty(contrasenia);
	}
	
	@Override
	public String getPropiedad(String clave) {
		// TODO Auto-generated method stub
		return p.getProperty(clave);
	}

}
