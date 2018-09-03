package AdapterPattern;

public class Client1 {
	
	public static void main(String[] args) {
		Target1 target1 = new Adapter1();
		target1.request();
	}

}
