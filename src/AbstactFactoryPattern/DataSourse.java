package AbstactFactoryPattern;

public class DataSourse {
	
	//private String db = "MySQL";
	private String db = "Oracle";
	
	public IUser CreateUser() 
	{
		IUser iUser = null;
		
		switch(db)
		{
		case "MySQL":
			iUser = new MySQLUser(); 
			break;
		case "Oracle":
			iUser = new OracleUser(); 
			break;
		}
		return iUser;
	}

	public IDepartment createDepartment()
	{
		IDepartment iDepartment = null;
		
		switch(db)
		{
		case "MySQL":
			iDepartment = new MySQLDepartment(); 
			break;
		case "Oracle":
			iDepartment = new OracleDepartment(); 
			break;
		}
		return iDepartment;
	}
}
