package SimpleFactoryPattern;

import java.util.Scanner;


public class Calculate {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner scanner;
			double result;
			
			System.out.print("����������1:");
			scanner = new Scanner(System.in);
			double num1 = scanner.nextDouble();

			System.out.print("�����������:");
			scanner = new Scanner(System.in);
			String operater = scanner.nextLine();
			
			System.out.print("����������2:");
			scanner = new Scanner(System.in);
			double num2 = scanner.nextDouble();
			
			switch(operater){
			case "+":
				result = num1 + num2;
				System.out.println("���Ϊ��"+ result);
				break;
			case "-":
			    result = num1 - num2;
				System.out.println("���Ϊ��"+ result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println("���Ϊ��"+ result);
				break;
			case "/":
				result = num1 / num2;
				System.out.println("���Ϊ��"+ result);
				break;
			}
			
		} catch (Exception e) {
			
			System.out.println("��������д�");
			e.printStackTrace();
			
		}
}
}
