package ProxyPattern;
/**
 * ί����  ׷������
 * @author Bywinkey
 *
 */
public class Pursuer implements IGiveGift {

	Girl girl;
	
	public Pursuer(Girl girl) {
		this.girl = girl;
	}
	
	@Override
	public void giveFlowers() {
		System.out.println("��˧˧��"+girl.getName()+"���㻨��~~~");
	}

	@Override
	public void giveChocolate() {
		System.out.println("��˧˧��"+girl.getName()+"�����ɿ���~~~");
	}

	@Override
	public void giveDolls() {
		System.out.println("��˧˧��"+girl.getName()+"��������~~~");
	}

}
