package Factory;

import java.util.Scanner;

import Interfaces.IExpresion;
import impl.IntToWords;
import impl.StringToBinary;
import model.Contexto;

public class AppInterpreter {
	
	public Contexto context = null;
	
	static Scanner sc = new Scanner(System.in);
	
	IExpresion e = null;
	
	public AppInterpreter(Contexto c) {
		this.context=c;
	}
	
	public void interprete(String str) {
		int op;
		for(int i=0; i<2;i++) {
			System.out.println("Escoja una opcion: 1. En letras 2. En Binario");
			op = sc.nextInt();
			switch(op) {
			case 1:
				e = new IntToWords(str);
				e.interprete(context);
				break;
			case 2:
				e = new StringToBinary(str);
				e.interprete(context);
				break;
				default:
					System.out.println("Esa opcion no hay pues chamo rulay");
			}
		}
	}
	
	public static void main(String[] args) {
	
		String input;
		Contexto contexto;
		AppInterpreter cl;
		
		System.out.println("Ingrese un numero: ");
		input = sc.next();
		contexto = new Contexto(input);
		cl = new AppInterpreter(contexto);
		cl.interprete(input);
	}
}