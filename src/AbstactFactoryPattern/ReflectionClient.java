package AbstactFactoryPattern;

public class ReflectionClient {
	
	public static void main(String[] args) {
		
		User user = new User();
		//IFactory iFactory = new MySQLFactory();
		
		ReflectionDataDourse dataMySQL = new ReflectionDataDourse();
		
		IUser iUser;
		try {
			
			iUser = dataMySQL.CreateUser();
			IDepartment iDepartment = dataMySQL.createDepartment();
			
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
