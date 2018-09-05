package BridgePattern;

public class Client {
	
	public static void main(String[] args) {
		
		PhoneKind kind;
		kind = new PhoneA();
		
		kind.setPhoneSoft(new GameSoft());
		kind.run();
		kind.setPhoneSoft(new AdressSoft());
		kind.run();
		
		kind = new PhoneB();
		
		kind.setPhoneSoft(new GameSoft());
		kind.run();
		kind.setPhoneSoft(new AdressSoft());
		kind.run();
		
	}
}
