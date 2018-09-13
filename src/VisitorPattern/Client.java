package VisitorPattern;

public class Client {

	public static void main(String[] args) {
		ObjectStructure objectStructure	= new ObjectStructure();
		
		objectStructure.add(new Man());
		objectStructure.add(new Woman());
		
		// �ɹ�ʱ�ķ�Ӧ
		ActionSuccess success = new ActionSuccess();
		objectStructure.display(success);
		
		// ʧ��ʱ�ķ�Ӧ
		ActionFailter failter = new ActionFailter();
		objectStructure.display(failter);
	}
}
