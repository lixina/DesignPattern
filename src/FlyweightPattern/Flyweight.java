package FlyweightPattern;
/**
 * 具体享元类
 * @author Bywinkey
 *
 */
public class Flyweight extends AbstractFlyweight{

	@Override
	public void Operation(int state) {
		System.out.println("具体享元类" + state);
	}
	
}
