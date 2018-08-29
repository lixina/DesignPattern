package ObserverPattern;
/**
 * �۲��߳�����
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
