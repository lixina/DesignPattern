package SingletonPattern;

import java.nio.ReadOnlyBufferException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程  添加进程锁
 * @author Bywinkey
 *
 */
public class Singleton_lan {
	
	// 懒汉模式
	private static Singleton_lan singleton;
	
	// 程序运行时创建一个静态只读的进程辅助对象
	private static Object syncRoot = new Object();
	
	// 构造方法让其private,这就堵死了外界利用new创建此类的新实力
	private Singleton_lan(){
	}
	
	// 获得本类实例的唯一全局访问点
	public static Singleton_lan getInstance() {
		
		// 若实例不存在，则new一个新实例，否则返回已有的实例 懒汉模式
		if (singleton == null){
			singleton = new Singleton_lan();
		}
		return singleton;
	}
	
}
