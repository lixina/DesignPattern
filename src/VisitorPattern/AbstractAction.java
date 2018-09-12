package VisitorPattern;

public abstract class AbstractAction {
	
	// 得到男人结论或反应
	public abstract void getManResult(AbstractPerson person);
	// 得到女人结论或反应
	public abstract void getWomanResult(AbstractPerson person);
}
