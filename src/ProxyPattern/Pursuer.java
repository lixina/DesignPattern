package ProxyPattern;
/**
 * 委托类  追求者类
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
		System.out.println("真帅帅："+girl.getName()+"送你花花~~~");
	}

	@Override
	public void giveChocolate() {
		System.out.println("真帅帅："+girl.getName()+"送你巧克力~~~");
	}

	@Override
	public void giveDolls() {
		System.out.println("真帅帅："+girl.getName()+"送你娃娃~~~");
	}

}
