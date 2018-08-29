package FactoryMethodPattern;

public class UndergraduateFactory implements ILeiFengFactory {

	@Override
	public LeiFeng createLeiFeng() {
		
		return new Undergraduate();
	}

}
