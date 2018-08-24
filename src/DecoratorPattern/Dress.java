package DecoratorPattern;
/**
 * concreteDecorator
 * @author Bywinkey
 *
 */
public class Dress extends Clothes{

	@Override
	public void show() {
		System.out.println("Á¬ÒÂÈ¹");
		super.show();
	}
}
