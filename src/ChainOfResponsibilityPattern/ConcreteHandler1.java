package ChainOfResponsibilityPattern;
/*
 * ���崦������
 */
public class ConcreteHandler1 extends Handler{

	@Override
	public void handleRequest(int request) {
		
		if (request >= 0 && request < 10) {
			System.out.println("��������1");
		}else if (successor != null) {
			System.out.println("����1�޷�����");
			successor.	handleRequest(request);
		}else{
			System.out.println("�Ƿ�����");
		}
		
	}
}
