package Prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Resume resume1 = new Resume("����");
		resume1.setPersonInfo("��", 24);
		resume1.setWorkExperience("2��", "����Ͱ�");
		
		Resume resume2 = (Resume) resume1.clone();
		resume2.setPersonInfo("��", 23);
		
		Resume resume3 = (Resume) resume1.clone();
		resume3.setPersonInfo("��", 22);
		
		resume1.Display();
		resume2.Display();
		resume3.Display();
	}
}
