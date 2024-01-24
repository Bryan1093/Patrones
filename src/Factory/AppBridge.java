package Factory;

import Interfaces.Figura;
import impl.ColorAzul;
import impl.ColorVerde;
import impl.Rectangulo;
import Interfaces.IColor;

public class AppBridge {
	
	public static void main(String[] args) {
	
		IColor cVerde = new ColorVerde();
		IColor cAzul = new ColorAzul();
		Figura fig = new Rectangulo(cAzul);
		fig.dibujarFigura(32);
		fig.modificarBorde(40, 2);
	}
}
