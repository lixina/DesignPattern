package AbstactFactoryPattern;

public class MySQLDepartment implements IDepartment{

	@Override
	public void update(int id) {
		System.out.println("MySQL����һ��������Ϣ��");
	}

	@Override
	public void select(int id) {
		System.out.println("MySQL����һ��������Ϣ��");
	}

}
