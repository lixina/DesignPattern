package AbstactFactoryPattern;

public class AbstratClient {
	
	public static void main(String[] args) {
		
		User user = new User();
		IFactory iFactory = new MySQLFactory();
		IUser iUser = iFactory.CreateUser();
		IDepartment iDepartment = iFactory.createDepartment();
		
		iUser.insert(user);
		iDepartment.update(1);
		
		
	}
}
