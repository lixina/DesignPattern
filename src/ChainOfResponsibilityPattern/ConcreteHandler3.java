package ChainOfResponsibilityPattern;
/*
 * ���崦������
 */
public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {
		
		if (request >= 20 && request < 30) {
			System.out.println("��������3");
		}else if (successor != null) {
			System.out.println("����3�޷�����");
			successor.handleRequest(request);
		}else{
			System.out.println("�Ƿ�����");
		}
		
	}
}
