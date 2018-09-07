package FlyweightPattern;
/**
 * 不共享的具体享元类
 * @author Bywinkey
 *
 */
public class UnsharedFlyweight extends AbstractFlyweight{

	@Override
	public void Operation(int state) {
		System.out.println("不共享的具体享元类" + state);
	}
	
}
