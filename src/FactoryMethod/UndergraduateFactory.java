package FactoryMethod;

public class UndergraduateFactory implements LeiFengIFactory {

	@Override
	public LeiFeng createLeiFeng() {
		
		return new Undergraduate();
	}

}
