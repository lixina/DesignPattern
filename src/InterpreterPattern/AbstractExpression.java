package InterpreterPattern;

public abstract class AbstractExpression {
	// ½âÊÍÆ÷
	public void interPret(Context context){
		
		if(context.getText().length() == 0){
			return;
		}else{
			String playKey = context.getText().substring(0,1);
			String temp = context.getText().substring(2);
			//double playValue = Double.parseDouble(temp.substring(0, temp.indexOf("")));
			int playValue = Integer.parseInt(temp.substring(0, temp.indexOf("")));
			temp = context.getText().substring(temp.indexOf("")+1);
			
			excute(playKey, playValue);
		}
	}
	// Ö´ÐÐ
	public abstract void excute(String key, int value);
}
