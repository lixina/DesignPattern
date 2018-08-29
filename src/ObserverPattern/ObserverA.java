package ObserverPattern;

public class ObserverA extends AbstractObserver {

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println(name+",关闭股票行情，继续工作！"+abstractNotify.getAction());
	}
	public ObserverA(String name, AbstractNotify abstractNotify) {
		this.name = name;
		this.abstractNotify = abstractNotify;
	}
}
