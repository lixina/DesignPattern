package ObserverPattern;

import java.util.ArrayList;

public class SevretaryB extends AbstractNotify{

	// 观察者列表
	private ArrayList<AbstractObserver> observers = new ArrayList<AbstractObserver>();
	private String action;
	
	@Override
	public void Detach(AbstractObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void Attach(AbstractObserver observer) {
		observers.add(observer);
	}

	@Override
	public void Notify() {
		for (AbstractObserver abstractObserver : observers) {
			abstractObserver.Update();
		}
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	

}
