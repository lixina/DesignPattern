package BridgePattern;

public class PhoneB extends PhoneKind{

	@Override
	public void run() {
		System.out.print("phoneB:");
		phoneSoft.run();
	}
}
