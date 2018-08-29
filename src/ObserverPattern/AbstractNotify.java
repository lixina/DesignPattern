package ObserverPattern;

public abstract class AbstractNotify {
	
	public abstract void Detach(AbstractObserver observer);
	// 增加 标记
	public abstract void Attach(AbstractObserver observer);
	// 通知
	public abstract void Notify();
	
	// 动作
	private String action;
		
	// 状态
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
}
