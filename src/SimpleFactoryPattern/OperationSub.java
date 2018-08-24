package SimpleFactoryPattern;
/**
 * ºı∑®‘ÀÀ„¿‡
 * @author Bywinkey
 *
 */
public class OperationSub extends OperationSuper{
	
	@Override
	public double getResult() {
		double result = 0;
		result = getNum1() - getNum2();
		return result;
	}
}
