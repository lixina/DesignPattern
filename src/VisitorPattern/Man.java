package VisitorPattern;

public class Man extends AbstractPerson{
	
	@Override
	public void accept(AbstractAction action) {
		action.getManResult(this);
	}
}
