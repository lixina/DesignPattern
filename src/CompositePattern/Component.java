package CompositePattern;
/**
 * �ܹ�˾����  Ҷ����  ����������¼�
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
		System.out.println("������������");
	}

	@Override
	public void remove(AbstractCompany company) {
		System.out.println("û����������Ƴ�");
	}

}
