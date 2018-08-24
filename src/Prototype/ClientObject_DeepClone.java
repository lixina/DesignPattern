package Prototype;

public class ClientObject_DeepClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ResumeObject_DeepClone resume1 = new ResumeObject_DeepClone("����");
		resume1.setPersonInfo("��", 24);
		WorkExperense_DeepClone workExperense = new WorkExperense_DeepClone("2��","����Ͱ�");
		resume1.setWorkExperience(workExperense);
		
		ResumeObject_DeepClone resume2 = (ResumeObject_DeepClone) resume1.clone();
		resume2.setPersonInfo("��", 23);
		
		ResumeObject_DeepClone resume3 = (ResumeObject_DeepClone) resume1.clone();
		resume3.setPersonInfo("��", 22);
		// ǳ��¡
		workExperense.setCompany("����Ͱ�");
		workExperense.setWorkTime("10��");
		//workExperense = new WorkExperense("2��","����Ͱ�");
		resume3.setWorkExperience(workExperense);
		
		resume1.Display();
		resume2.Display();
		resume3.Display();
	}
}
