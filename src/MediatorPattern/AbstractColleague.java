package MediatorPattern;
/**
 * 抽象同事类
 * @author Bywinkey
 *
 */
public abstract class AbstractColleague {
	
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator mediator) {
		super();
		this.mediator = mediator;
	}
}
