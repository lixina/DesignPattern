package ProxyPattern;

public class Proxy implements GiveGift{

	Pursuer pursuer;
	
	public Proxy(Girl girl) 
	{
		pursuer = new Pursuer(girl);
	}
	
	@Override
	public void giveFlowers() 
	{
		pursuer.giveFlowers();
		//System.out.println("我帮真帅帅送你花花~~~");
	}

	@Override
	public void giveChocolate() 
	{
		pursuer.giveChocolate();
		//System.out.println("我帮真帅帅送你巧克力~~~");
	}

	@Override
	public void giveDolls() 
	{
		pursuer.giveDolls();
		//System.out.println("我帮真帅帅送你娃娃~~~");
	}

}
