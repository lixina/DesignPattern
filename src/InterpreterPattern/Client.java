package InterpreterPattern;

public class Client {

	public static void main(String[] args) {
		
		Context context = new Context();
		System.out.println("ÉÏº£Ì²");
		
		context.setText("0 2 E 0.5 G .05 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 0"
				+ "2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		
		AbstractExpression abstractExpression = null;
		
		while (context.getText().length() > 0) {
			String string = context.getText().substring(0, 1);
			switch (string) {
			case "O":
				abstractExpression = new Scale();
				break;
			case "C":
			case "D":
			case "E":
			case "F":
			case "G":
			case "A":
			case "B":
			case "P":
				abstractExpression = new Note();
				break;
			}
			abstractExpression.interPret(context);
		}
	}
}
