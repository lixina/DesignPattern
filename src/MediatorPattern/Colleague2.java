package MediatorPattern;

public class Colleague2 extends AbstractColleague{

	public Colleague2(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send (String message) {
		mediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println("Í¬ÊÂ2£º"+message);
	}
}
