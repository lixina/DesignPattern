package ChainOfResponsibilityPattern;
/*
 * 具体处理者类
 */
public class ConcreteHandler1 extends Handler{

	@Override
	public void handleRequest(int request) {
		
		if (request >= 0 && request < 10) {
			System.out.println("处理请求1");
		}else if (successor != null) {
			System.out.println("请求1无法处理");
			successor.	handleRequest(request);
		}else{
			System.out.println("非法请求");
		}
		
	}
}
