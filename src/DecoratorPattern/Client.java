package DecoratorPattern;

public class Client {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("小可爱");
		System.out.println("第一种装扮：");
		
		Dress dress = new Dress();
		HighHeels highHeels = new HighHeels();
		
		dress.wearing(person);
		highHeels.wearing(dress);
		highHeels.show();
		
		person.setName("休闲风");
		System.out.println("第二种装扮：");
		
		Tshirt tshirt = new Tshirt();
		Shorts shorts = new Shorts();
		Sneakers sneakers = new Sneakers();
		
		tshirt.wearing(person);
		shorts.wearing(tshirt);
		sneakers.wearing(shorts);
		sneakers.show();
		
	}
}
