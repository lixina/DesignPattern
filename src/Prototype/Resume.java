package Prototype;

public class Resume implements Cloneable {
	
	private String name;
	private int age;
	private String sex;
	private String workTime;
	private String company;
	
	public Resume(String name) {
		this.name = name;
	}
	
	// ���ø�����Ϣ
	public void setPersonInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	// ���ù�������
	public void setWorkExperience(String workTime,String company){
		this.workTime = workTime;
		this.company = company;
	}
	
	// ��ʾ
	public void Display() {
		System.out.println("����:"+name+"\n"+"���:"+age+"\n"+"�Ա�:"+sex);
		System.out.println("����������"+workTime+company+"\n");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
