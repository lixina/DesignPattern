package DirectorPattern;

public class Client {

	public static void main(String[] args) {
		
		PersonBuilder fatPerson = new FatPerson();
		Director director1 = new Director(fatPerson);
		director1.createPerson();
		
		PersonBuilder thinPerson = new ThinPerson();
		Director director2 = new Director(thinPerson);
		director2.createPerson();
	}
	
}
