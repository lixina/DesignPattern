package FlyweightPattern;
/**
 * ������ľ�����Ԫ��
 * @author Bywinkey
 *
 */
public class UnsharedFlyweight extends AbstractFlyweight{

	@Override
	public void Operation(int state) {
		System.out.println("������ľ�����Ԫ��" + state);
	}
	
}
