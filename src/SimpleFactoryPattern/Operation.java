package SimpleFactoryPattern;

import java.math.BigDecimal;

public class Operation{
	

	public static void operation(String operater,BigDecimal num1,BigDecimal num2){
		
		double result;
		// ������λС��
		// DecimalFormat df = new DecimalFormat("######0.00");
		// df.format(result);
		switch(operater){
		case "+":
			result = num1.add(num2).doubleValue(); 
			System.out.println("���Ϊ��"+ result);
			break;
		case "-":
		    result = num1.subtract(num2).doubleValue();
			System.out.println("���Ϊ��"+ result);
			break;
		case "*":
			result = num1.multiply(num1).doubleValue();
			System.out.println("���Ϊ��"+ result);
			break;
		case "/":
			// 6:������ʱ��ָ������
			if(!num2.equals(BigDecimal.ZERO)){
				result = num1.divide(num2,6,BigDecimal.ROUND_HALF_UP).doubleValue();
				System.out.println("���Ϊ��"+ result);
				break;
			}else{
				throw new ArithmeticException("����������Ϊ����.");
			}
		}
	}
}
