package SimpleFactoryPattern;

import java.math.BigDecimal;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
	
		try {
			
			Scanner scanner;	
			// BigDecimal bigDecimal;
			
			System.out.print("����������1:");
			scanner = new Scanner(System.in);
			// double num1 = scanner.nextDouble();
			// ������ת��Ϊʮ���Ƹ�����ʱ���������׶�ʧ�����¾����½�,Ҫ��֤���Ⱦ�Ҫʹ��BigDecimal��
			// Ex:39.989999999999995 0.12300000000000001
			String num1 = scanner.nextLine();
			BigDecimal bigDecimal1 = new BigDecimal(num1);

			System.out.print("�����������:");
			
			scanner = new Scanner(System.in);
			String operater = scanner.nextLine();
			
			System.out.print("����������2:");
			scanner = new Scanner(System.in);
			// double num2 = scanner.nextDouble();
			String num2 = scanner.nextLine();
			BigDecimal bigDecimal2 = new BigDecimal(num2);
			
			Operation.operation(operater,bigDecimal1,bigDecimal2);
			
		} catch (Exception e) {
			
			System.out.println("��������д�");
			e.printStackTrace();
			
		}
		
	}
}