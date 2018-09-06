package ChainOfResponsibilityPattern;

public class Client {
	
	public static void main(String[] args) {
		
		ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
		ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
		ConcreteHandler3 concreteHandler3 = new ConcreteHandler3();
		
		concreteHandler1.setSuccessor(concreteHandler2);
		concreteHandler2.setSuccessor(concreteHandler3);
		
		int[] requests = { 2, 12, 22, 32};
		
		for (int i : requests) {
			System.out.println("«Î«Û:"+ i);
			concreteHandler1.handleRequest(i);
		}
	}
}
