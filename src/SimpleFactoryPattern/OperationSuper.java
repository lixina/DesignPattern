package SimpleFactoryPattern;

/**
 * 运算父类
 * @author Bywinkey
 *
 */
public class OperationSuper {
	
    private double num1;
    private double num2;
    
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	//运算结果
	public double getResult() {
		double result = 0;
		return result;
	}
    
}
