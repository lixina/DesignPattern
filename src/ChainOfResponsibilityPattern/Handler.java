package ChainOfResponsibilityPattern;
/**
 * ����һ��������ʾ�Ľӿ�
 * @author Bywinkey
 *
 */
public abstract class Handler {
	
	protected Handler successor;
	// ���ü�����
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	// ��������ĳ��󷽷�
	public abstract void handleRequest(int request);
	
}
