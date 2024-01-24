package impl;

import java.util.Properties;

import Interfaces.Conexion;


public class ConexionMysql implements Conexion{
	private static ConexionMysql instancia ; 
	private Properties p;
	
	private ConexionMysql() {
		p = getProperties();
		
	}
	
	public static ConexionMysql getInstacia() {
		if(instancia == null) {
			instancia = new ConexionMysql();
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
		// TODO Auto-generated method stub
		return p.getProperty(clave);
	}

}
