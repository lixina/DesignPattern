package ObserverPattern;

public class ClientA {

	public static void main(String[] args) {
		
		// 通知者
		AbstractNotify notify = new Boss();
		AbstractNotify abstractNotify = new SevretaryB();
		// 观察者
		AbstractObserver observer1 = new ObserverA("小白",notify);
		AbstractObserver observer2 = new ObserverB("小黑",abstractNotify);
		// 通知者标记观察者
		notify.Attach(observer1);
		abstractNotify.Attach(observer2);
		// 通知者做的事情
		notify.setAction("我胡汉三回来了");
		abstractNotify.setAction("老板回来了");
		// 通知者通知观察者
		notify.Notify();
		abstractNotify.Notify();
	}
}
