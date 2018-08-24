package Prototype;

public class ClientObject_DeepClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ResumeObject_DeepClone resume1 = new ResumeObject_DeepClone("´ô×Ó");
		resume1.setPersonInfo("ÄÐ", 24);
		WorkExperense_DeepClone workExperense = new WorkExperense_DeepClone("2Äê","°¢Àï°Í°Í");
		resume1.setWorkExperience(workExperense);
		
		ResumeObject_DeepClone resume2 = (ResumeObject_DeepClone) resume1.clone();
		resume2.setPersonInfo("ÄÐ", 23);
		
		ResumeObject_DeepClone resume3 = (ResumeObject_DeepClone) resume1.clone();
		resume3.setPersonInfo("ÄÐ", 22);
		// Ç³¿ËÂ¡
		workExperense.setCompany("°¢Àï°Í°Í");
		workExperense.setWorkTime("10Äê");
		//workExperense = new WorkExperense("2Äê","°¢Àï°Í°Í");
		resume3.setWorkExperience(workExperense);
		
		resume1.Display();
		resume2.Display();
		resume3.Display();
	}
}
