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
	
	// 设置个人信息
	public void setPersonInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	// 设置工作经历
	public void setWorkExperience(String workTime,String company){
		this.workTime = workTime;
		this.company = company;
	}
	
	// 显示
	public void Display() {
		System.out.println("名字:"+name+"\n"+"年纪:"+age+"\n"+"性别:"+sex);
		System.out.println("工作经历："+workTime+company+"\n");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
