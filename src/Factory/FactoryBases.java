package Factory;

import Interfaces.Conexion;
import impl.ConexionMysql;
import impl.ConexionORACLE;
import impl.ConexionPostgres;

public class FactoryBases {
	public Conexion getConfiguracion(Bases b) {
		switch(b) {
		case ORACLE:
			return ConexionORACLE.getInstacia();
		case POSTGRES:
			return ConexionPostgres.getInstacia();
		case MYSQL:
			return ConexionMysql.getInstacia();
			default: return null;
		}
	}
}