package MediatorPattern;


/**
 * 具体中介者
 * @author Bywinkey
 *
 */
public class Mediator extends AbstractMediator{
	
	private Colleague1 colleague1;
	private Colleague2 colleague2;
	
	public void setColleague1(Colleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public void setColleague2(Colleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	@Override
	public void send(String message, AbstractColleague colleague) {
		
		if (colleague == colleague1) {
			colleague1.notify(message);
		}else{
			colleague2.notify(message);
		}
	}
}
