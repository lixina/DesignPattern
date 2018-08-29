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
	
	private ResumeObject_DeepClone(WorkExperense_DeepClone workExperense) throws CloneNotSupportedException {
		this.workExperense = (WorkExperense_DeepClone) workExperense.clone();
	}
	
	// 设置个人信息
	public void setPersonInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	
	// 设置工作经历
	public void setWorkExperience(String company,String workTime) throws CloneNotSupportedException{
		WorkExperense_DeepClone workExperense = new WorkExperense_DeepClone(workTime, workTime);
		workExperense.setCompany(company);
		workExperense.setWorkTime(workTime);
	}
	// 显示
	public void Display() {
		System.out.println("名字:"+name+"\n"+"年纪:"+age+"\n"+"性别:"+sex);
		System.out.println("工作经历："+workExperense.getWorkTime()+workExperense.getCompany()+"\n");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//ResumeObject_DeepClone deepClone = new ResumeObject_DeepClone(this.workExperense);
		ResumeObject_DeepClone deepClone = new ResumeObject_DeepClone(this.name);
		//deepClone.name = this.name;
		deepClone.age = this.age;
		deepClone.sex = this.sex;
		deepClone.setWorkExperience(workExperense.getCompany(), workExperense.getWorkTime());
		return deepClone;
	}

	public void setWorkExperience(WorkExperense_DeepClone workExperense2) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		this.workExperense = (WorkExperense_DeepClone) this.workExperense.clone();
	}
	
}
