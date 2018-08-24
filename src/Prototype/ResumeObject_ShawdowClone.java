package Prototype;

public class ResumeObject_ShawdowClone implements Cloneable {
	
	private String name;
	private int age;
	private String sex;
	private WorkExperense_ShadowClone workExperense;
	
	public ResumeObject_ShawdowClone(String name) {
		this.name = name;
	}
	
	// ���ø�����Ϣ
	public void setPersonInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	// ���ù�������
	public void setWorkExperience(WorkExperense_ShadowClone workExperense) throws CloneNotSupportedException{
		this.workExperense =workExperense;
	}
	// ��ʾ
	public void Display() {
		System.out.println("����:"+name+"\n"+"���:"+age+"\n"+"�Ա�:"+sex);
		System.out.println("����������"+workExperense.getWorkTime()+workExperense.getCompany()+"\n");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
