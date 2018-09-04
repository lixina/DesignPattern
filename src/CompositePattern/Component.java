package CompositePattern;
/**
 * 总公司部门  叶子类  不能再添加下级
 * @author Bywinkey
 *
 */
public class Component extends AbstractCompany {

	public Component(String name) {
		super(name);
	}

	@Override
	public void dispaly() {
		System.out.println("--"+name);
	}

	@Override
	public void add(AbstractCompany company) {
		System.out.println("不能增加子类");
	}

	@Override
	public void remove(AbstractCompany company) {
		System.out.println("没有子类可以移除");
	}

}
