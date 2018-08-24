package StrategyPattern;
/**
 * 收费工厂类
 * @author Bywinkey
 *
 */
public class CashFactory {
	public static CashSuper createCashMode(String mode){
		
		CashSuper cs = null;
		
		switch(mode){
		case "打折":
			cs = new CashDiscount(0.7);
			break;
		case "正常":
			cs = new CashNomal();
			break;	
		case "满减":
			cs = new CashReduction(100, 50);
			break;	
		}
		
		return cs;
	}
}
