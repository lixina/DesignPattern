package AbstactFactoryPattern;

public class OracleUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("Oracle插入一条用户信息！");
		
	}

	@Override
	public void delete(int id) {
		System.out.println("Oracle根据id删除一条用户信息");		
	}

}
