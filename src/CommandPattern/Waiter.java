package CommandPattern;

public class Waiter {

	private Command command;

	// 设置订单
	public void setCommand(Command command) {
		this.command = command;
	}


	public Waiter() {
	}
	// 执行通知
	public void notifys() {
		command.runCommand();
	}
}
