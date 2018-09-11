package InterpreterPattern;

public class Scale extends AbstractExpression{
	@Override
	public void excute(String key, int value) {
		
		String scale = "";
		
		switch(value){
		case 1:
			scale = "µÕ“Ù";
			break;
		case 2:
			scale = "÷–“Ù";
			break;
		case 3:
			scale = "∏ﬂ“Ù";
			break;
		}
		System.out.println(scale);
	}
}
