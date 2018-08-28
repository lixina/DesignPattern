package AbstactFactoryPattern;

public class MySQLDepartment implements IDepartment{

	@Override
	public void update(int id) {
		System.out.println("MySQL插入一条部门信息！");
	}

	@Override
	public void select(int id) {
		System.out.println("MySQL插入一条部门信息！");
	}

}
