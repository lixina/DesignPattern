package StrategyPattern;
/**
 * ¥Ú’€ ’∑—
 * @author Bywinkey
 *
 */
public class CashDiscount extends CashSuper {
    
	private double moneyDiscount;
	
	public CashDiscount(double moneyDiscount) {
		super();
		this.moneyDiscount = moneyDiscount;
	}
	
	public double getMoneyDiscount() {
		return moneyDiscount;
	}

	public void setMoneyDiscount(double moneyDiscount) {
		this.moneyDiscount = moneyDiscount;
	}


	@Override
	public double acceptCash(double money) {
		double result = money*getMoneyDiscount();
		return result;
	}

}
