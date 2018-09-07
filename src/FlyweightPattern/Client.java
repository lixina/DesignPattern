package FlyweightPattern;

class Client {

	public static void main(String[] args) {
		
		int state = 2;// Íâ²¿´úÂë×´Ì¬
		
		FlyweightFactory factory = new FlyweightFactory();
		
		factory.flyweightFactory();
		
		AbstractFlyweight flyweight1 = factory.getFlyweight("X");
		flyweight1.Operation(state);
		
		AbstractFlyweight flyweight2 = factory.getFlyweight("Y");
		flyweight2.Operation(--state);
		
		AbstractFlyweight flyweight3 = factory.getFlyweight("Z");
		flyweight3.Operation(--state);
		
		UnsharedFlyweight flyweight4 = new UnsharedFlyweight();
		flyweight4.Operation(--state);
	}
}
