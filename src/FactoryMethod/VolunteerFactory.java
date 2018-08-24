package FactoryMethod;

public class VolunteerFactory implements LeiFengIFactory {

	@Override
	public LeiFeng createLeiFeng() {
		
		return new Volunteer();
	}

}
