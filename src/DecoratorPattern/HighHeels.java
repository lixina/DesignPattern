package DecoratorPattern;
/**
 * concreteDecorator
 * @author Bywinkey
 *
 */
public class HighHeels extends Clothes{

	@Override
	public void show() {
		System.out.println("�߸�Ь");
		super.show();
	}
}