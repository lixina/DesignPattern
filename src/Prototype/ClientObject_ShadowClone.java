package Prototype;

public class ClientObject_ShadowClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ResumeObject_ShawdowClone resume1 = new ResumeObject_ShawdowClone("����");
		resume1.setPersonInfo("��", 24);
		WorkExperense_ShadowClone workExperense = new WorkExperense_ShadowClone("2��","����Ͱ�");
		resume1.setWorkExperience(workExperense);
		
		ResumeObject_ShawdowClone resume2 = (ResumeObject_ShawdowClone) resume1.clone();
		resume2.setPersonInfo("��", 23);
		
		ResumeObject_ShawdowClone resume3 = (ResumeObject_ShawdowClone) resume1.clone();
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
