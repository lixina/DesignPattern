package StrategyPattern;

public class CashContext {
	
	CashSuper cashSuper = null;

	public void createCashMode(String mode){
			
			switch(mode){
			case "����":
				cashSuper = new CashDiscount(0.7);
				break;
			case "����":
				cashSuper = new CashNomal();
				break;	
			case "����":
				cashSuper = new CashReduction(100, 50);
				break;	
			}
			
		}

	public double getResult(double money){
		
		return cashSuper.acceptCash(money);
	}
}
