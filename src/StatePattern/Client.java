package StatePattern;

public class Client {

	public static void main(String[] args) {
		
		Work work = new Work();
		work.setHour(13);
		work.writeProgram(work);
	}
}
