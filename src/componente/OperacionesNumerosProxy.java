package componente;

public class OperacionesNumerosProxy implements OperacionesNumeros{

	private OperacionesNumerosImpl target = new OperacionesNumerosImpl();
	
	@Override
	public int sumar(int x, int y) {
		
		int res;
		
		System.out.println("Accediendo a travez de un PROXY");
		res = target.sumar(x, y);
		System.out.println("Respondiendo a travez del PROXY");
		
		return res;
	}

	@Override
	public int restar(int x, int y) {
		
		int res;
		
		System.out.println("Accediendo a travez de un PROXY");
		res = target.restar(x, y);
		System.out.println("Respondiendo a travez del PROXY");
		
		return res;
	}

}