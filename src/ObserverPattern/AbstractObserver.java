package ObserverPattern;
/**
 * 观察者抽象类
 * @author Bywinkey
 *
 */
public abstract class AbstractObserver
	{
	protected String name;
	protected AbstractNotify abstractNotify;
	
	public AbstractObserver()
	{
		this.name = name;
		this.abstractNotify = abstractNotify;
	}
	
	public abstract void Update();
}
