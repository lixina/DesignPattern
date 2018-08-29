package ObserverPattern;

public class StockObserver {
	
	private String name;
	private Secretary secretary;
	
	public StockObserver(String name,Secretary secretary) 
	{
		this.name = name;
		this.secretary = secretary;
	}
	
	public void Update()
	{
		System.out.println(name+",关闭股票行情，继续工作！"+secretary.getAction());
	}

}
