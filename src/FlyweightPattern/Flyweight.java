package FlyweightPattern;
/**
 * ������Ԫ��
 * @author Bywinkey
 *
 */
public class Flyweight extends AbstractFlyweight{

	@Override
	public void Operation(int state) {
		System.out.println("������Ԫ��" + state);
	}
	
}
