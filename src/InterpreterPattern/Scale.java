package InterpreterPattern;

public class Scale extends AbstractExpression{
	@Override
	public void excute(String key, int value) {
		
		String scale = "";
		
		switch(value){
		case 1:
			scale = "����";
			break;
		case 2:
			scale = "����";
			break;
		case 3:
			scale = "����";
			break;
		}
		System.out.println(scale);
	}
}
