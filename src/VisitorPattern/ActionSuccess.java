package VisitorPattern;

public class ActionSuccess extends AbstractAction{

	@Override
	public void getManResult(AbstractPerson person) {
		System.out.println("背后多半有个伟大的女人");
	}

	@Override
	public void getWomanResult(AbstractPerson person) {
		System.out.println("背后大多有一个不成功的男人");
		
	}
}
