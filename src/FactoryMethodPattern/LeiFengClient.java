package FactoryMethodPattern;

public class LeiFengClient {
	
	public static void main(String[] args) {
		
		ILeiFengFactory iFactory = new UndergraduateFactory();
		LeiFeng student = iFactory.createLeiFeng();
		
		student.buyrice();
		
		ILeiFengFactory iFactory1 = new VolunteerFactory();
		LeiFeng volunteer = iFactory1.createLeiFeng();
		
		volunteer.sweep();
		
	}
	
	
}
