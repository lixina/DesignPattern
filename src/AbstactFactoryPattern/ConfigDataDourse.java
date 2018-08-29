package AbstactFactoryPattern;

import java.util.ResourceBundle;


public class ConfigDataDourse {
	
	ResourceBundle resource = ResourceBundle.getBundle("AbstactFactoryPattern/App");//test为属性文件名，放在包com.mmq下，如果是放在src下，直接用test即可  
	String key = resource.getString("DB");
	
	private String assemblyName = "AbstactFactoryPattern.";// 程序集名称
	private String db = key;// 数据库名称
	
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
