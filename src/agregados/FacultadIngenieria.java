package agregados;

import java.util.Iterator;

import Interfaces.ICarreras;
import Interfaces.IIterator;

public class FacultadIngenieria implements ICarreras {

    private String[] carreras;

    public FacultadIngenieria() {
        carreras = new String[4];
        carreras[0] = "Computación";
        carreras[1] = "Civil";
        carreras[2] = "Sistemas de Información";
        carreras[3] = "Diseño Industrial";
    }

    /*@Override
    public Iterator crearIterator() {
        return new IngIterator(carreras);
    }*/

    public class IngIterator implements IIterator {

        private String[] carreras;
        private int indice;

        public IngIterator(String[] carr) {
            this.carreras = carr;
            indice = 0;
        }

        @Override
        public Boolean finLista() {
            return indice >= carreras.length;
        }

        @Override
        public String elementoActual() {
            return carreras[indice];
        }

        @Override
        public void primerElemento() {
            indice = 0;
        }

        @Override
        public String next() {
            return carreras[indice++];
        }

    }

	@Override
	public Iterator crearIterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
