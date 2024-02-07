package model;

public class Contexto {

	private String input;
	
	public Contexto(String input) {
		this.input=input;
	}
	
	public void getBinaryForm(String input) {
		int i = Integer.parseInt(input);
		String binaryString = Integer.toBinaryString(i);
		System.out.println("El numero binario equivalente de "+input+" es: "+binaryString);
	}
	
	public void imprimirEnPalabras(String input) {
		this.input=input;
		char[] c = input.toCharArray();
		System.out.println("Imprimiendo cada digito en palabras: ");
		for(int i=0; i<c.length;i++) {
			switch(c[i]) {
		
		    case '0':
		        System.out.println("Cero");
		        break;
		    case '1':
		        System.out.println("Uno");
		        break;
		    case '2':
		        System.out.println("Dos");
		        break;
		    case '3':
		        System.out.println("Tres");
		        break;
		    case '4':
		        System.out.println("Cuatro");
		        break;
		    case '5':
		        System.out.println("Cinco");
		        break;
		    case '6':
		        System.out.println("Seis");
		        break;
		    case '7':
		        System.out.println("Siete");
		        break;
		    case '8':
		        System.out.println("Ocho");
		        break;
		    case '9':
		        System.out.println("Nueve");
		        break;
		    default:
		        System.out.println(" ");
		}

		}
	}
}
