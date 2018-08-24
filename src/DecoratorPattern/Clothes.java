package DecoratorPattern;
/**
 * Decorator
 * @author Bywinkey
 *
 */
public class Clothes extends Person{
	
	protected Person person;
	
	// װ��
	public void wearing(Person person)
	{
		this.person = person;
	}
	
	@Override
	public void show()
	{
		if(person != null)
		{
			person.show();
		}
	}
	
}
