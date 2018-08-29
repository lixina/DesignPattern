package ObserverPattern;

import java.util.ArrayList;

public class SecretaryA {

	// 同事列表
	private ArrayList<AbstractObserver> observers = new ArrayList<AbstractObserver>();
	private String action;
	
	// 增加  针对抽象类的编程，减少了与具体类的耦合
	public void Attach(AbstractObserver observer)
	{
		observers.add(observer);
	}
	
	// 通知  针对抽象类的编程，减少了与具体类的耦合
	public void Notify()
	{
		for (AbstractObserver abstactbserver : observers) {
			abstactbserver.Update();
		}
	}
	
	// 前台状态
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
}
