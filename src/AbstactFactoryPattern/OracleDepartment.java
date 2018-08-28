package AbstactFactoryPattern;

public class OracleDepartment implements IDepartment{

	@Override
	public void update(int id) {
		System.out.println("Oracle插入一条部门信息！");
	}

	@Override
	public void select(int id) {
		System.out.println("Oracle插入一条部门信息！");
	}

}
