package CommandPattern;

public class Waiter {

	private Command command;

	// ���ö���
	public void setCommand(Command command) {
		this.command = command;
	}


	public Waiter() {
	}
	// ִ��֪ͨ
	public void notifys() {
		command.runCommand();
	}
}
