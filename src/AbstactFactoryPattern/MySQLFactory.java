package AbstactFactoryPattern;

public class MySQLFactory implements IFactory
{

	@Override
	public IUser CreateUser() 
	{
		
		return new MySQLUser();
	}

	@Override
	public IDepartment createDepartment()
	{
		
		return new MySQLDepartment();
	}
}