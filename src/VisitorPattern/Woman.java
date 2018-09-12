package VisitorPattern;

public class Woman extends AbstractPerson{
	
	@Override
	public void accept(AbstractAction action) {
		action.getWomanResult(this);
	}
}
