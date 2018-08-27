package TemplateMethodPattern;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("йт╬Мa");
		PaperSuper paperA = new TestPaperA();
		paperA.Question();
		
		System.out.println("йт╬Мb");
		PaperSuper paperB = new TestPaperB();
		paperB.Question();
		
	}
}
