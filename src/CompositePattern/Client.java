package CompositePattern;

public class Client {

	public static void main(String[] args) {
		
		SonCompany company = new SonCompany("�ܹ�˾");
		company.add(new Component("--����"));
		company.add(new Component("--���²�"));

		
		SonCompany company1 = new SonCompany("--�ֹ�˾1");
		company.add(company1);
		company1.add(new Component("----�Ӽ�����"));
		company1.add(new Component("----�Ӳ���"));
		
		company.dispaly();
	}
}
