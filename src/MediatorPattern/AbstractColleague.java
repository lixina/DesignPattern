package MediatorPattern;
/**
 * ����ͬ����
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
