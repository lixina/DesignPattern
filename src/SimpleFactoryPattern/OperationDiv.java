package SimpleFactoryPattern;

public class OperationDiv extends OperationSuper{
	@Override
	public double getResult() {
		double result = 0;
		if(getNum2() != 0){
			result = getNum1() / getNum2();
			return result;
		}else{
		    throw new ArithmeticException("被除数不能为负数.");
		}
		
	}
}
