package ObserverPattern;

public class Client {

	public static void main(String[] args) {
		
		// ֪ͨ��
		Secretary secretary = new Secretary();
		// �۲���
		StockObserver observer1 = new StockObserver("С��",secretary);
		StockObserver observer2 = new StockObserver("С��",secretary);
		// ֪ͨ�߱�ǹ۲���
		secretary.Attach(observer1);
		secretary.Attach(observer2);
		// ֪ͨ����������
		secretary.setAction("�ϰ������");
		// ֪ͨ��֪ͨ�۲���
		secretary.Notify();
	}
}
