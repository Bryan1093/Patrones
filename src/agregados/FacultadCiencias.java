package agregados;

import java.util.Iterator;
import java.util.LinkedList;

import Interfaces.ICarreras;
import Interfaces.IIterator;

public class FacultadCiencias implements ICarreras{

	private LinkedList<String> carreras;
	
	public FacultadCiencias() {
		carreras = new LinkedList<String>();
		carreras.add("Fisica");
		carreras.add("Matematica");
		carreras.add("Biologia");
		carreras.add("Fisica");
		carreras.add("Quimica");
		carreras.add("Estadistica");
	}
	/*@Override
	public Iterator crearIterator() {
	    return new CienciasIterator(carreras);
	}*/

	
	public class CienciasIterator implements IIterator{

		private LinkedList<String> carreras;
		private int indice;
		
		public CienciasIterator(LinkedList<String> carr) {
			this.carreras = carr;
			indice =0;
		}
		
		@Override
		public Boolean finLista() {
			
			return indice > carreras.size();
		}

		@Override
		public String elementoActual() {
			
			return carreras.get(indice);
		}

		@Override
		public void primerElemento() {
			indice =0;
		}

		@Override
		public String next() {
			
			return carreras.get(indice++);
		}
		
	}


	@Override
	public Iterator crearIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
