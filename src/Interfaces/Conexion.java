package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public interface Conexion {
	
	String getPropiedad(String clave);
		default Properties getProperties() {
			Properties p = new Properties();
			try {
				p.load(new FileInputStream(new String("C:\\Users\\bryan\\eclipse-workspace\\Factory\\src\\Factory\\bases.properties")));
			}catch(Exception e) {
				e.printStackTrace();
			}
			return p;
		}
		
		String getPropiedad1(String usuario);
		default Properties getProperties1() {
			Properties p = new Properties();
			try {
				p.load(new FileInputStream(new String("C:\\Users\\bryan\\eclipse-workspace\\Factory\\src\\Factory\\bases.properties")));
			}catch(Exception e) {
				e.printStackTrace();
			}
			return p;
		}
		
		String getPropiedad2(String contrasenia);
		default Properties getProperties2() {
			Properties p = new Properties();
			try {
				p.load(new FileInputStream(new String("C:\\Users\\bryan\\eclipse-workspace\\Factory\\src\\Factory\\bases.properties")));
			}catch(Exception e) {
				e.printStackTrace();
			}
			return p;
		}
		
}
