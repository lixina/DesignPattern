package SimpleFactoryPattern;
/**
 * �������๤��
 * @author Bywinkey
 *
 */
public class OperationFactory {
	
	public static OperationSuper createOperation(String operater){
		
		OperationSuper operation = null;
		
		switch(operater){
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		case "*":
			
			break;
		case "/":
			
			break;
		}
		return operation;
	}
	
}
