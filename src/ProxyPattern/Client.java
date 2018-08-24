package ProxyPattern;

public class Client {
	
	public static void main(String[] args) {
		
		Girl girl = new Girl();
		girl.setName("∫√√¿¿ˆ");
		
		Proxy proxy = new Proxy(girl);
		
		proxy.giveChocolate();
		proxy.giveDolls();
		proxy.giveFlowers();
	}
}
