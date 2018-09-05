package CommandPattern;

public class BakeMeat extends Command{
	
	
	public BakeMeat(Babercuer babercuer) {
		super(babercuer);
	}

	@Override
	public void runCommand() {
		babercuer.bakeMeat();
	}
}
