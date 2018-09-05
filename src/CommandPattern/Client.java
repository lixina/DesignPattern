package CommandPattern;

public class Client {
	
	public static void main(String[] args) {
		
		Babercuer babercuer = new Babercuer();
		
		Command meatCommand = new BakeMeat(babercuer);
		Command chickenCommand = new BakeChicken(babercuer);
		
		Waiter waiter = new Waiter();
		
		waiter.setCommand(meatCommand);
		waiter.notifys();
		
		waiter.setCommand(chickenCommand);
		waiter.notifys();
	}
}
