package ObserverPattern;

public abstract class AbstractNotify {
	
	public abstract void Detach(AbstractObserver observer);
	// ���� ���
	public abstract void Attach(AbstractObserver observer);
	// ֪ͨ
	public abstract void Notify();
	
	// ����
	private String action;
		
	// ״̬
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
}
