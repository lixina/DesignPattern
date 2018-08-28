package AbstactFactoryPattern;

public class AbstratClient {
	
	public static void main(String[] args) {
		
		User user = new User();
		//IFactory iFactory = new MySQLFactory();
		
		DataMySQL dataMySQL = new DataMySQL();
		
		IUser iUser = dataMySQL.CreateUser();
		IDepartment iDepartment = dataMySQL.createDepartment();
		
		iUser.insert(user);
		iDepartment.update(1);
		
		
	}
}
