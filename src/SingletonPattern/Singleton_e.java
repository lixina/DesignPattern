package SingletonPattern;

public class Singleton_e {
	
	// 饿汉模式
	private static Singleton_e singleton = new Singleton_e();
	
	// 构造方法让其private,这就堵死了外界利用new创建此类的新实力
	private Singleton_e(){
	}
	
	// 获得本类实例的唯一全局访问点
	public static Singleton_e getInstance() {
		return singleton;
	}
	
}
