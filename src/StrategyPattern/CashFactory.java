package StrategyPattern;
/**
 * �շѹ�����
 * @author Bywinkey
 *
 */
public class CashFactory {
	public static CashSuper createCashMode(String mode){
		
		CashSuper cs = null;
		
		switch(mode){
		case "����":
			cs = new CashDiscount(0.7);
			break;
		case "����":
			cs = new CashNomal();
			break;	
		case "����":
			cs = new CashReduction(100, 50);
			break;	
		}
		
		return cs;
	}
}
