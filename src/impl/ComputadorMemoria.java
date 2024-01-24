package impl;

public class ComputadorMemoria {
	
	private String disco;
	private String ram;

	
	public void setDisco(String disco) {
		this.disco=disco;
		this.ram="16 GB de RAM";
		System.out.println(".........Ensamblando con disco de: " 
		+ disco + " y " + ram);
	}

}
