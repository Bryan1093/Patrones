package Interfaces;

import model.Mascota;

public interface IEstado {
	void jugar();
	void alimentar();
	void dormir();
	void estadoAnimo();
	void setMascota(Mascota mascota);
}
