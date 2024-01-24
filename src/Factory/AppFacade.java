package Factory;

import Facade.ComputadorFacade;

public class AppFacade {
	public static void main(String[] args) {
		
		ComputadorFacade crear = new ComputadorFacade();
		crear.constComputador(" 512 TB GB SSD", "12th Gen Intel(R) Core(TM) i5-12450H   2.00 GHz");
		
	}

}
