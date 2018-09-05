package BridgePattern;

public abstract class PhoneKind {
	
	protected PhoneSoft phoneSoft;
	// 设置手机软件
	public void setPhoneSoft(PhoneSoft phoneSoft) {
		this.phoneSoft = phoneSoft;
	}
	// 运行
	public abstract void run();
	
}
