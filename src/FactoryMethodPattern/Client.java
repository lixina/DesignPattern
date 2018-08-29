package FactoryMethodPattern;

import SimpleFactoryPattern.OperationSuper;

/**
 * �ͻ���
 * @author Bywinkey
 *
 */
public class Client {
	// �򵥹���ģʽ������ŵ����ڹ������а����˱�Ҫ���߼��жϣ����ݿͻ��˵�ѡ��������̬ʵ������ص��࣬
	// ���ڿͻ�����˵��ȥ����������Ʒ������
	
	// ��������ģʽʵ��ʱ���ͻ�����Ҫ����ʵ������һ��������ʵ��Ԥ���࣬ѡ���жϵ����⻹�Ǵ��ڵģ�Ҳ����˵��
	// ���������Ѽ򵥹������ڲ��߼��ж��Ƶ��˿ͻ��˴�����У������ӹ���Ҫ�Ĺ����࣬�������޸Ŀͻ���
	public static void main(String[] args) {
		IFactory iFactory = new AddFactory();
		OperationSuper operationSuper = iFactory.createOperation();
		operationSuper.setNum1(2);
		operationSuper.setNum2(0);
		double result = operationSuper.getResult();
		System.out.println(result);
	}
}
