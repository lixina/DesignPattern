package SingletonPattern;

public class Client {
	
	public static void main(String[] args) {
		
		Singleton_lan singleton1 = Singleton_lan.getInstance();
		Singleton_lan singleton2 = Singleton_lan.getInstance();
		
		if (singleton1 ==singleton2){
			System.out.println("同一个实例");
		}else{
			System.out.println("不是同一个实例");
		}
	}
	
}
