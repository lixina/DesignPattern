package SingletonPattern;

public class Client {
	
	public static void main(String[] args) {
		
		Singleton_lan singleton1 = Singleton_lan.getInstance();
		Singleton_lan singleton2 = Singleton_lan.getInstance();
		
		if (singleton1 ==singleton2){
			System.out.println("ͬһ��ʵ��");
		}else{
			System.out.println("����ͬһ��ʵ��");
		}
	}
	
}
