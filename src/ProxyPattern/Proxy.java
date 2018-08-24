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
		//System.out.println("�Ұ���˧˧���㻨��~~~");
	}

	@Override
	public void giveChocolate() 
	{
		pursuer.giveChocolate();
		//System.out.println("�Ұ���˧˧�����ɿ���~~~");
	}

	@Override
	public void giveDolls() 
	{
		pursuer.giveDolls();
		//System.out.println("�Ұ���˧˧��������~~~");
	}

}
