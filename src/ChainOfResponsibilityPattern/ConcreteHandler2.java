package ChainOfResponsibilityPattern;
/*
 * ���崦������
 */
public class ConcreteHandler2 extends Handler{

	@Override
	public void handleRequest(int request) {
		
		if (request >= 10 && request < 20) {
			System.out.println("��������2");
		}else if (successor != null) {
			System.out.println("����2�޷�����");
			successor.handleRequest(request);
		}else{
			System.out.println("�Ƿ�����");
		}
		
	}
}
