package Prototype;

public class WorkExperense_ShadowClone {
	
	private String workTime;
	private String company;
	
	public WorkExperense_ShadowClone(String workTime, String company) {
		super();
		this.workTime = workTime;
		this.company = company;
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
