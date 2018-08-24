package Prototype;

public class ResumeObject_DeepClone implements Cloneable {
	
	private String name;
	private int age;
	private String sex;
	private WorkExperense_DeepClone workExperense;
	
	public ResumeObject_DeepClone(String name) {
		this.name = name;
		workExperense = new WorkExperense_DeepClone();
	}
	
	// ���ø�����Ϣ
	public void setPersonInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	private ResumeObject_DeepClone(WorkExperense_DeepClone workExperense) throws CloneNotSupportedException {
		this.workExperense = (WorkExperense_DeepClone) workExperense.clone();
	}
	
	// ���ù�������
	public void setWorkExperience(WorkExperense_DeepClone workExperense) throws CloneNotSupportedException{
		this.workExperense = (WorkExperense_DeepClone) this.workExperense.clone();
	}
	// ��ʾ
	public void Display() {
		System.out.println("����:"+name+"\n"+"���:"+age+"\n"+"�Ա�:"+sex);
		System.out.println("����������"+workExperense.getWorkTime()+workExperense.getCompany()+"\n");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ResumeObject_DeepClone deepClone = new ResumeObject_DeepClone(this.workExperense);
		deepClone.name = this.name;
		deepClone.age = this.age;
		deepClone.sex = this.sex;
		return deepClone;
	}
	
}
