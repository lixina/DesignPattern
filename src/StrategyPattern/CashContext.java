package StrategyPattern;

public class CashContext {
	
	CashSuper cashSuper = null;

	public void createCashMode(String mode){
			
			switch(mode){
			case "Дђел":
				cashSuper = new CashDiscount(0.7);
				break;
			case "е§ГЃ":
				cashSuper = new CashNomal();
				break;	
			case "ТњМѕ":
				cashSuper = new CashReduction(100, 50);
				break;	
			}
			
		}

	public double getResult(double money){
		
		return cashSuper.acceptCash(money);
	}
}
