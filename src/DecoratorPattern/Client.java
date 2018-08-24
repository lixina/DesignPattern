package DecoratorPattern;

public class Client {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("С�ɰ�");
		System.out.println("��һ��װ�磺");
		
		Dress dress = new Dress();
		HighHeels highHeels = new HighHeels();
		
		dress.wearing(person);
		highHeels.wearing(dress);
		highHeels.show();
		
		person.setName("���з�");
		System.out.println("�ڶ���װ�磺");
		
		Tshirt tshirt = new Tshirt();
		Shorts shorts = new Shorts();
		Sneakers sneakers = new Sneakers();
		
		tshirt.wearing(person);
		shorts.wearing(tshirt);
		sneakers.wearing(shorts);
		sneakers.show();
		
	}
}
