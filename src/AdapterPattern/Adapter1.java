package AdapterPattern;

public class Adapter1 extends Target1{

	private Adaptee1 adaptee1 = new Adaptee1();
	
	@Override
	public void request() {
		adaptee1.spacialRequest();
	}
	
	
}
