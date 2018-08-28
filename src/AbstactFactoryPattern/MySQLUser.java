package AbstactFactoryPattern;

public class MySQLUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("MySQL插入一条用户信息！");
		
	}

	@Override
	public void delete(int id) {
		System.out.println("MySQL根据id删除一条用户信息");		
	}

}
