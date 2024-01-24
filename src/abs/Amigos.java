package abs;

public abstract class Amigos {
	protected Mediator mediator;
	public String name;
	public abstract void enviar(String mns);
	public abstract void notify(String mns);
	
	public Amigos(Mediator mediator) {
			this.mediator=mediator;
	}
}