package BridgePattern;

public abstract class PhoneKind {
	
	protected PhoneSoft phoneSoft;
	// �����ֻ����
	public void setPhoneSoft(PhoneSoft phoneSoft) {
		this.phoneSoft = phoneSoft;
	}
	// ����
	public abstract void run();
	
}
