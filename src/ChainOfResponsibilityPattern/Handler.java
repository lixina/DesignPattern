package ChainOfResponsibilityPattern;
/**
 * 定义一个处理请示的接口
 * @author Bywinkey
 *
 */
public abstract class Handler {
	
	protected Handler successor;
	// 设置继任者
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	// 处理请求的抽象方法
	public abstract void handleRequest(int request);
	
}
