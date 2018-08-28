package AbstactFactoryPattern;

public class ReflectionDataDourse {
	
	private String assemblyName = "AbstactFactoryPattern.";// ��������
	private String db = "Oracle";// ���ݿ�����
	
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
