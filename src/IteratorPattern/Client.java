package IteratorPattern;

public class Client {
	
	public static void main(String[] args) {
		
		Aggregate aggregate = new Aggregate();
		
		aggregate.setItems(0,"a");
		aggregate.setItems(0,"b");
		aggregate.setItems(0,"c");
		aggregate.setItems(0,"d");
		
		Iterator iterator = new Iterator(aggregate);
		
		Object object = iterator.first();
		System.out.println(object);
		
		while (!iterator.isDone()) {
			System.out.println(iterator.currentItem()+"±éÀú");
			iterator.next();
		}
	}
}
