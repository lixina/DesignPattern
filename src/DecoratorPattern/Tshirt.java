package DecoratorPattern;
/**
 * concreteDecorator
 * @author Bywinkey
 *
 */
public class Tshirt extends Clothes{

	@Override
	public void show() {
		System.out.println("T��");
		super.show();
	}
}