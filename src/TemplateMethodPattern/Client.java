package TemplateMethodPattern;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("�Ծ�a");
		QuestionSuper paperA = new TestPaperA();
		paperA.Question();
		
		System.out.println("�Ծ�b");
		QuestionSuper paperB = new TestPaperB();
		paperB.Question();
		
	}
}
