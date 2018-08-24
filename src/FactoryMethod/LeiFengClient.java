package FactoryMethod;

public class LeiFengClient {
	
	public static void main(String[] args) {
		
		LeiFengIFactory iFactory = new UndergraduateFactory();
		LeiFeng student = iFactory.createLeiFeng();
		
		student.buyrice();
		
		LeiFengIFactory iFactory1 = new VolunteerFactory();
		LeiFeng volunteer = iFactory1.createLeiFeng();
		
		volunteer.sweep();
		
	}
	
	
}
