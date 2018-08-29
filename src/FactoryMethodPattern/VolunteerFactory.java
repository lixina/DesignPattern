package FactoryMethodPattern;

public class VolunteerFactory implements ILeiFengFactory {

	@Override
	public LeiFeng createLeiFeng() {
		
		return new Volunteer();
	}

}
