package AbstactFactoryPattern;

public class MySQLUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("MySQL����һ���û���Ϣ��");
		
	}

	@Override
	public void delete(int id) {
		System.out.println("MySQL����idɾ��һ���û���Ϣ");		
	}

}
