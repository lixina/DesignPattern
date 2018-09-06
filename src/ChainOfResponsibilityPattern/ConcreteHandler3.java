package ChainOfResponsibilityPattern;
/*
 * 具体处理者类
 */
public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {
		
		if (request >= 20 && request < 30) {
			System.out.println("处理请求3");
		}else if (successor != null) {
			System.out.println("请求3无法处理");
			successor.handleRequest(request);
		}else{
			System.out.println("非法请求");
		}
		
	}
}
