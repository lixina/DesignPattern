package AbstactFactoryPattern;

public class OracleDepartment implements IDepartment{

	@Override
	public void update(int id) {
		System.out.println("Oracle����һ��������Ϣ��");
	}

	@Override
	public void select(int id) {
		System.out.println("Oracle����һ��������Ϣ��");
	}

}
