package CommandPattern;

public class BakeChicken extends Command{
	
	
	public BakeChicken(Babercuer babercuer) {
		super(babercuer);
	}

	@Override
	public void runCommand() {
		babercuer.bakeChicken();
	}
}
