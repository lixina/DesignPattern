package CommandPattern;

public class WaiterUpper {

	private Command command;

	// ���ö���
	public void setCommand(Command command) {
		this.command = command;
	}


	public WaiterUpper() {
	}
	// ִ��֪ͨ
	public void notifys() {
		command.runCommand();
	}
}
