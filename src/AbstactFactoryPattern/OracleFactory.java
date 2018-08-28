package AbstactFactoryPattern;

public class OracleFactory implements IFactory
{

	@Override
	public IUser CreateUser() 
	{
		
		return new OracleUser();
	}

	@Override
	public IDepartment createDepartment()
	{
		
		return new OracleDepartment();
	}
}