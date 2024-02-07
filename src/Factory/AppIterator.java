package Factory;

import Interfaces.ICarreras;
import Interfaces.IIterator;
import agregados.FacultadCiencias;
import agregados.FacultadIngenieria;

public class AppIterator {

	public static void main(String[] args) {
	    ICarreras ciencias = new FacultadCiencias();
	    //IIterator iCiencias = ciencias.crearIterator();
	    System.out.println("Carrera facultad de Ciencias: ");
	    //imprimir(iCiencias);

	    ICarreras ingenieria = new FacultadIngenieria();
	    //IIterator iIngenieria = ingenieria.crearIterator();
	    System.out.println("Carrera facultad de Ingenieria: ");
	    //imprimir(iIngenieria);
	}


    public static void imprimir(IIterator iCiencias) {
        while (!iCiencias.finLista()) {
            System.out.println(iCiencias.next());
        }
    }
}
