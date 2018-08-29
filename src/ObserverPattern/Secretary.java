package ObserverPattern;

import java.util.ArrayList;

public class Secretary {

	// ͬ���б�
	private ArrayList<StockObserver> observers = new ArrayList<StockObserver>();
	private String action;
	
	// ����
	public void Attach(StockObserver observer)
	{
		observers.add(observer);
	}
	
	// ֪ͨ
	public void Notify()
	{
		for (StockObserver stockObserver : observers) {
			stockObserver.Update();
		}
	}
	
	// ǰ̨״̬
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
}
