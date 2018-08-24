package StrategyPattern;
/**
 * Âú¼õÊÕ·Ñ
 * @author Bywinkey
 *
 */
public class CashReduction extends CashSuper {

	private double moneyAll;
	private double moneySub;
	
	public double getMoneyAll() {
		return moneyAll;
	}

	public void setMoneyAll(double moneyAll) {
		this.moneyAll = moneyAll;
	}

	public double getMoneySub() {
		return moneySub;
	}

	public void setMoneySub(double moneySub) {
		this.moneySub = moneySub;
	}

	public CashReduction(double moneyAll, double moneySub) {
		super();
		this.moneyAll = moneyAll;
		this.moneySub = moneySub;
	}

	@Override
	public double acceptCash(double money) {
		
		double result = money;
		
		
		if(money >= getMoneyAll()){
			double a = money/getMoneyAll();
			double c = Math.floor(a);
			result = money - (c*getMoneySub());
			return result;
		}else{
			return result;			
		}
	}

}
