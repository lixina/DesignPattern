package MediatorPattern;

public class Colleague1 extends AbstractColleague{

	public Colleague1(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send (String message) {
		mediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println("Í¬ÊÂ1£º"+message);
	}
}
