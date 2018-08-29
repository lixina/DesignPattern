package AbstactFactoryPattern;

public class ConfigClient {
	
	public static void main(String[] args) {
		
		User user = new User();
		
		ConfigDataDourse datasourse = new ConfigDataDourse();
		
		IUser iUser;
		try {
			
			iUser = datasourse.CreateUser();
			IDepartment iDepartment = datasourse.createDepartment();
			
			iUser.insert(user);
			iDepartment.update(1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
