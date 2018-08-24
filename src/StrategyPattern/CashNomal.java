package StrategyPattern;
/**
 * 正常收费
 * @author Bywinkey
 *
 */
public class CashNomal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		
		return money;
	}

}
