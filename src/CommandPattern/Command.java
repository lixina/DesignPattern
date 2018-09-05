package CommandPattern;

public abstract class Command {
	
	protected Babercuer babercuer;

	public Command(Babercuer babercuer) {
		super();
		this.babercuer = babercuer;
	}

	// Ö´ĞĞÃüÁî
	public abstract void runCommand();
}
