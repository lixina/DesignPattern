package SingletonPattern;

import java.nio.ReadOnlyBufferException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ���߳�  ��ӽ�����
 * @author Bywinkey
 *
 */
public class Singleton_lan {
	
	// ����ģʽ
	private static Singleton_lan singleton;
	
	// ��������ʱ����һ����ֻ̬���Ľ��̸�������
	private static Object syncRoot = new Object();
	
	// ���췽������private,��Ͷ������������new�����������ʵ��
	private Singleton_lan(){
	}
	
	// ��ñ���ʵ����Ψһȫ�ַ��ʵ�
	public static Singleton_lan getInstance() {
		
		// ��ʵ�������ڣ���newһ����ʵ�������򷵻����е�ʵ�� ����ģʽ
		if (singleton == null){
			singleton = new Singleton_lan();
		}
		return singleton;
	}
	
}
