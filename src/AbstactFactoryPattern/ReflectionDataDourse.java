package AbstactFactoryPattern;

public class ReflectionDataDourse {
	
	private String assemblyName = "AbstactFactoryPattern.";// 程序集名称
	private String db = "Oracle";// 数据库名称
	
	String temp;
	Class c;
	
	public IUser CreateUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		temp = assemblyName+db+"User";
		c = Class.forName(temp);
		IUser iUser = (IUser) c.newInstance();
		return iUser;
	}

	public IDepartment createDepartment() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		temp = assemblyName+db+"Department";
		c = Class.forName(temp);
		IDepartment iDepartment = (IDepartment) c.newInstance();
		return iDepartment;
	}
}
