package Prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Resume resume1 = new Resume("´ô×Ó");
		resume1.setPersonInfo("ÄÐ", 24);
		resume1.setWorkExperience("2Äê", "°¢Àï°Í°Í");
		
		Resume resume2 = (Resume) resume1.clone();
		resume2.setPersonInfo("ÄÐ", 23);
		
		Resume resume3 = (Resume) resume1.clone();
		resume3.setPersonInfo("ÄÐ", 22);
		
		resume1.Display();
		resume2.Display();
		resume3.Display();
	}
}
