package SingletonPattern;

public class Singleton_e {
	
	// ����ģʽ
	private static Singleton_e singleton = new Singleton_e();
	
	// ���췽������private,��Ͷ������������new�����������ʵ��
	private Singleton_e(){
	}
	
	// ��ñ���ʵ����Ψһȫ�ַ��ʵ�
	public static Singleton_e getInstance() {
		return singleton;
	}
	
}
