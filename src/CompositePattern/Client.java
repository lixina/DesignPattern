package CompositePattern;

public class Client {

	public static void main(String[] args) {
		
		SonCompany company = new SonCompany("总公司");
		company.add(new Component("--财务部"));
		company.add(new Component("--人事部"));

		
		SonCompany company1 = new SonCompany("--分公司1");
		company.add(company1);
		company1.add(new Component("----子技术部"));
		company1.add(new Component("----子财务部"));
		
		company.dispaly();
	}
}
