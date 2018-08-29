package ObserverPattern;

import java.util.ArrayList;

public class Secretary {

	// 同事列表
	private ArrayList<StockObserver> observers = new ArrayList<StockObserver>();
	private String action;
	
	// 增加
	public void Attach(StockObserver observer)
	{
		observers.add(observer);
	}
	
	// 通知
	public void Notify()
	{
		for (StockObserver stockObserver : observers) {
			stockObserver.Update();
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
