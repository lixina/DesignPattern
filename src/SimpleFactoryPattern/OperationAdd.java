package SimpleFactoryPattern;
/**
 * �ӷ�������
 * @author Bywinkey
 *
 */
public class OperationAdd extends OperationSuper{
	
	@Override
	public double getResult() {
		double result = 0;
		result = getNum1() + getNum2();
		return result;
	}
}
