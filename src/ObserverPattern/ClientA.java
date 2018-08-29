package ObserverPattern;

public class ClientA {

	public static void main(String[] args) {
		
		// ֪ͨ��
		AbstractNotify notify = new Boss();
		AbstractNotify abstractNotify = new SevretaryB();
		// �۲���
		AbstractObserver observer1 = new ObserverA("С��",notify);
		AbstractObserver observer2 = new ObserverB("С��",abstractNotify);
		// ֪ͨ�߱�ǹ۲���
		notify.Attach(observer1);
		abstractNotify.Attach(observer2);
		// ֪ͨ����������
		notify.setAction("�Һ�����������");
		abstractNotify.setAction("�ϰ������");
		// ֪ͨ��֪ͨ�۲���
		notify.Notify();
		abstractNotify.Notify();
	}
}
