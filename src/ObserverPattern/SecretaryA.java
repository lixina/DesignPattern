package ObserverPattern;

import java.util.ArrayList;

public class SecretaryA {

	// ͬ���б�
	private ArrayList<AbstractObserver> observers = new ArrayList<AbstractObserver>();
	private String action;
	
	// ����  ��Գ�����ı�̣������������������
	public void Attach(AbstractObserver observer)
	{
		observers.add(observer);
	}
	
	// ֪ͨ  ��Գ�����ı�̣������������������
	public void Notify()
	{
		for (AbstractObserver abstactbserver : observers) {
			abstactbserver.Update();
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
