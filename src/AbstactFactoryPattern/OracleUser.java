package AbstactFactoryPattern;

public class OracleUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("Oracle����һ���û���Ϣ��");
		
	}

	@Override
	public void delete(int id) {
		System.out.println("Oracle����idɾ��һ���û���Ϣ");		
	}

}
