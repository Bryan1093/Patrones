package model;

import impl.ObservadorDos;
import impl.ObservadorTres;
import impl.ObservadorUno;
import impl.Subject;
import impl.SubjectDos;

public class AppObserver {

	public static void main(String[] args) {
		
		ObservadorUno obs1 = new ObservadorUno();
		Subject sub = new Subject();
		ObservadorDos obs2 = new ObservadorDos();
		ObservadorTres obs3 = new ObservadorTres();
		
		sub.register(obs3);
		sub.register(obs2);
		sub.register(obs1);
		sub.setValor(10);
		sub.setValor(20);
		sub.register(obs3);
		sub.setValor(30);
		
		System.out.println(" ");
		System.out.println("-------------------------------------");
		System.out.println(" ");
		ObservadorUno obs4 = new ObservadorUno();
		SubjectDos sub2 = new SubjectDos();
		ObservadorDos obs5 = new ObservadorDos();
		ObservadorTres obs6 = new ObservadorTres();
		
		sub2.register(obs3);
		sub2.register(obs2);
		sub2.register(obs1);
		sub2.setValor(100);
		sub2.setValor(200);
		sub2.setValor(300);
	}
}
