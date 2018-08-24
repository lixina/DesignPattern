package SimpleFactoryPattern;

import java.math.BigDecimal;
import java.util.Scanner;

public class ClientInput {
	public static void main(String[] args) {
		try {
			
			Scanner scanner;
			double result;
			
			System.out.print("请输入数字1:");
			scanner = new Scanner(System.in);
			double num1 = scanner.nextDouble();

			System.out.print("请输入运算符:");
			scanner = new Scanner(System.in);
			String operater = scanner.nextLine();
			
			System.out.print("请输入数字2:");
			scanner = new Scanner(System.in);
			double num2 = scanner.nextDouble();
			
			OperationSuper operationFather = OperationFactory.createOperation(operater);
			operationFather.setNum1(num1);
			operationFather.setNum2(num2);
			System.out.println("运算结果为："+operationFather.getResult());
			
		} catch (Exception e) {
			
			System.out.println("你的输入有错！");
			e.printStackTrace();
			
		}
	}
}
