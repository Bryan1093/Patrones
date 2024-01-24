package Factory;

import Interfaces.Conexion;
import java.lang.System;

public class AppFactory {
	public static void main(String[] args) {
		 FactoryBases f = new FactoryBases();
		 
			Conexion c = f.getConfiguracion(Bases.MYSQL);
			Conexion co = f.getConfiguracion(Bases.MYSQL);
			System.out.println(c.getPropiedad("Mysql.usuario"));
			System.out.println(c.getPropiedad("Mysql.password"));
			System.out.println(c.getPropiedad("Mysql.url"));
			System.out.println("\n");
			
			FactoryBases f1 = new FactoryBases();
			Conexion c1 = f1.getConfiguracion(Bases.ORACLE);
			Conexion co1 = f1.getConfiguracion(Bases.ORACLE);
			System.out.println(c.getPropiedad("Oracle.usuario"));
			System.out.println(c.getPropiedad("Oracle..password"));
			System.out.println(c.getPropiedad("Oracle.url"));
			System.out.println("\n");
			
			FactoryBases f2 = new FactoryBases();
			Conexion c2 = f2.getConfiguracion(Bases.POSTGRES);
			Conexion co2 = f2.getConfiguracion(Bases.POSTGRES);
			System.out.println(c.getPropiedad("Postgres.usuario"));
			System.out.println(c.getPropiedad("Postgres.password"));
			System.out.println(c.getPropiedad("Postgres.url"));
	}
}