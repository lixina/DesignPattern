package SimpleFactoryPattern;

import java.math.BigDecimal;

public class Operation{
	

	public static void operation(String operater,BigDecimal num1,BigDecimal num2){
		
		double result;
		// 保留两位小数
		// DecimalFormat df = new DecimalFormat("######0.00");
		// df.format(result);
		switch(operater){
		case "+":
			result = num1.add(num2).doubleValue(); 
			System.out.println("结果为："+ result);
			break;
		case "-":
		    result = num1.subtract(num2).doubleValue();
			System.out.println("结果为："+ result);
			break;
		case "*":
			result = num1.multiply(num1).doubleValue();
			System.out.println("结果为："+ result);
			break;
		case "/":
			// 6:除不尽时，指定精度
			if(!num2.equals(BigDecimal.ZERO)){
				result = num1.divide(num2,6,BigDecimal.ROUND_HALF_UP).doubleValue();
				System.out.println("结果为："+ result);
				break;
			}else{
				throw new ArithmeticException("被除数不能为负数.");
			}
		}
	}
}
