package SimpleFactoryPattern;
/**
 * ³Ë·¨
 * @author Bywinkey
 *
 */
public class OperationMul extends OperationSuper{
	
	@Override
	public double getResult() {
		double result = 0;
		result = getNum1() * getNum2();
		return result;
	}
	
}
