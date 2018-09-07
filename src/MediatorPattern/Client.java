package MediatorPattern;

public class Client {

	public static void main(String[] args) {
		
		Mediator mediator = new Mediator();
		
		Colleague1 colleague1 = new Colleague1(mediator);
		Colleague2 colleague2 = new Colleague2(mediator);
		
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		colleague1.send("hello");
		colleague2.send("hi");
	}
}
