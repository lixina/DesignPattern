package Prototype;

public class ResumeObject_ShawdowClone implements Cloneable {
	
	private String name;
	private int age;
	private String sex;
	private WorkExperense_ShadowClone workExperense;
	
	public ResumeObject_ShawdowClone(String name) {
		this.name = name;
	}
	
	// 设置个人信息
	public void setPersonInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	// 设置工作经历
	public void setWorkExperience(WorkExperense_ShadowClone workExperense) throws CloneNotSupportedException{
		this.workExperense =workExperense;
	}
	// 显示
	public void Display() {
		System.out.println("名字:"+name+"\n"+"年纪:"+age+"\n"+"性别:"+sex);
		System.out.println("工作经历："+workExperense.getWorkTime()+workExperense.getCompany()+"\n");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
