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
		System.out.println(name+",�رչ�Ʊ���飬����������"+secretary.getAction());
	}

}
