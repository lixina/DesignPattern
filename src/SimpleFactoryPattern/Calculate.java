package SimpleFactoryPattern;

import java.util.Scanner;


public class Calculate {
	
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
			
			switch(operater){
			case "+":
				result = num1 + num2;
				System.out.println("结果为："+ result);
				break;
			case "-":
			    result = num1 - num2;
				System.out.println("结果为："+ result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println("结果为："+ result);
				break;
			case "/":
				result = num1 / num2;
				System.out.println("结果为："+ result);
				break;
			}
			
		} catch (Exception e) {
			
			System.out.println("你的输入有错！");
			e.printStackTrace();
			
		}
}
}
