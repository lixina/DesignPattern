package ChainOfResponsibilityPattern;
/*
 * 具体处理者类
 */
public class ConcreteHandler2 extends Handler{

	@Override
	public void handleRequest(int request) {
		
		if (request >= 10 && request < 20) {
			System.out.println("处理请求2");
		}else if (successor != null) {
			System.out.println("请求2无法处理");
			successor.handleRequest(request);
		}else{
			System.out.println("非法请求");
		}
		
	}
}
