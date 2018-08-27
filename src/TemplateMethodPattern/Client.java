package TemplateMethodPattern;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("йт╬Мa");
		QuestionSuper paperA = new TestPaperA();
		paperA.Question();
		
		System.out.println("йт╬Мb");
		QuestionSuper paperB = new TestPaperB();
		paperB.Question();
		
	}
}
