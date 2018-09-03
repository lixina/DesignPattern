package AdapterPattern;
/**
 * 可以是具体的/抽象的类 也可以是接口
 * 客户期待的接口
 * @author Bywinkey
 *
 */
public class Target {
	
	public void request() {
		System.out.println("目标类：普通请求");
	}
}
