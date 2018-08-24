package SimpleFactoryPattern;

import java.math.BigDecimal;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
	
		try {
			
			Scanner scanner;	
			// BigDecimal bigDecimal;
			
			System.out.print("请输入数字1:");
			scanner = new Scanner(System.in);
			// double num1 = scanner.nextDouble();
			// 二进制转化为十进制浮点数时，精度容易丢失，导致精度下降,要保证精度就要使用BigDecimal类
			// Ex:39.989999999999995 0.12300000000000001
			String num1 = scanner.nextLine();
			BigDecimal bigDecimal1 = new BigDecimal(num1);

			System.out.print("请输入运算符:");
			
			scanner = new Scanner(System.in);
			String operater = scanner.nextLine();
			
			System.out.print("请输入数字2:");
			scanner = new Scanner(System.in);
			// double num2 = scanner.nextDouble();
			String num2 = scanner.nextLine();
			BigDecimal bigDecimal2 = new BigDecimal(num2);
			
			Operation.operation(operater,bigDecimal1,bigDecimal2);
			
		} catch (Exception e) {
			
			System.out.println("你的输入有错！");
			e.printStackTrace();
			
		}
		
	}
}