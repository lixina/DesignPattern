package Prototype;

public class WorkExperense_DeepClone implements Cloneable {
	
	private String workTime;
	private String company;
	
	public WorkExperense_DeepClone(String workTime, String company) {
		super();
		this.workTime = workTime;
		this.company = company;
	}
	public WorkExperense_DeepClone() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
