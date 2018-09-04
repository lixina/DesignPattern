package CompositePattern;
/**
 * 公司抽象类
 * @author Bywinkey
 *
 */
public abstract class AbstractCompany {
	
	protected String name;

	public AbstractCompany(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(AbstractCompany company);
	public abstract void remove(AbstractCompany company);
	public abstract void dispaly();
}
