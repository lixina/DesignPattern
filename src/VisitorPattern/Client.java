package VisitorPattern;

public class Client {

	public static void main(String[] args) {
		ObjectStructure objectStructure	= new ObjectStructure();
		
		objectStructure.add(new Man());
		objectStructure.add(new Woman());
		
		// 成功时的反应
		ActionSuccess success = new ActionSuccess();
		objectStructure.display(success);
		
		// 失败时的反应
		ActionFailter failter = new ActionFailter();
		objectStructure.display(failter);
	}
}
