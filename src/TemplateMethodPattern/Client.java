package TemplateMethodPattern;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("�Ծ�a");
		PaperSuper paperA = new TestPaperA();
		paperA.Question();
		
		System.out.println("�Ծ�b");
		PaperSuper paperB = new TestPaperB();
		paperB.Question();
		
	}
}
