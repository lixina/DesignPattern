package TemplateMethodPattern;

public abstract class PaperSuper {
	
	public void Question1()
	{
		System.out.println("����һ��");
		System.out.println("�𰸣�"+anwser1());
	}
	public void Question2()
	{
		System.out.println("�������");
		System.out.println("�𰸣�"+anwser2());
	}
	public void Question3()
	{
		System.out.println("��������");
		System.out.println("�𰸣�"+anwser3());
	}
	
	public String anwser1() {
		return null;
	}
	public String anwser2() {
		return null;
	}
	public String anwser3() {
		return null;
	}
	
	public void Question()
	{
		
		Question1();
		Question2();
		Question3();
		
	}
	
	
}
