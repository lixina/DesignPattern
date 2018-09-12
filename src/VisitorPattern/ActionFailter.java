package VisitorPattern;

public class ActionFailter extends AbstractAction{

	@Override
	public void getManResult(AbstractPerson person) {
		System.out.println("男人失败时谁也不用劝");
	}

	@Override
	public void getWomanResult(AbstractPerson person) {
		System.out.println("女人失败时谁也劝不了");
		
	}
}
