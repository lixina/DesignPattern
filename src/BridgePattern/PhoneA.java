package BridgePattern;

public class PhoneA extends PhoneKind{

	@Override
	public void run() {
		System.out.print("phoneA:");
		phoneSoft.run();
	}
}
