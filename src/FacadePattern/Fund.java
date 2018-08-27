package FacadePattern;
/**
 * Õ‚π€¿‡
 * @author Bywinkey
 *
 */
public class Fund {

	Stock stock = new Stock();
	Realty realty = new Realty();
	NationalDebt nationalDebt = new NationalDebt();
	
	/*public Fund() {
		
	}*/
	
	public void buyFund() {
		stock.Buy();
		realty.Buy();
		nationalDebt.Buy();
	}
	
	public void sellFund() {
		stock.Sell();
		realty.Sell();
		nationalDebt.Sell();
		}
}
