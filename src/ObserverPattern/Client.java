package ObserverPattern;

public class Client {

	public static void main(String[] args) {
		
		// 通知者
		Secretary secretary = new Secretary();
		// 观察者
		StockObserver observer1 = new StockObserver("小白",secretary);
		StockObserver observer2 = new StockObserver("小黑",secretary);
		// 通知者标记观察者
		secretary.Attach(observer1);
		secretary.Attach(observer2);
		// 通知者做的事情
		secretary.setAction("老板回来了");
		// 通知者通知观察者
		secretary.Notify();
	}
}
