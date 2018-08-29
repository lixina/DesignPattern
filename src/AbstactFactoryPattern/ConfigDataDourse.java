package AbstactFactoryPattern;

import java.util.ResourceBundle;


public class ConfigDataDourse {
	
	ResourceBundle resource = ResourceBundle.getBundle("AbstactFactoryPattern/App");//testΪ�����ļ��������ڰ�com.mmq�£�����Ƿ���src�£�ֱ����test����  
	String key = resource.getString("DB");
	
	private String assemblyName = "AbstactFactoryPattern.";// ��������
	private String db = key;// ���ݿ�����
	
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
	
	/*URL url = new URL("AbstactFactoryPattern/App.properties");  
	InputStream inStream = url.openStream();
	Properties properties = new Properties();  
	properties.load(inStream); 
	String value = properties.getProperty("DB");  */
	
	
	
}
