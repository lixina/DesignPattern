package ObserverPattern;

public class ObserverB extends AbstractObserver {

	public ObserverB(String name, AbstractNotify abstractNotify) {
		this.name = name;
		this.abstractNotify = abstractNotify;
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println(name+",关闭NBA，继续工作！"+abstractNotify.getAction());
	}
	
}
