package StatePattern;
/**
 * 上午和中午工作状态
 * @author Bywinkey
 *
 */
public class MoringState extends State{

	@Override
	public void writeProgram(Work w) {
		if (w.getHour()<12){
			System.out.println("上午"+w.getHour()+"精神百倍");
		}else{
			NoonState noonState = new NoonState();
			w.setState(noonState);
			noonState.writeProgram(w);
		}
	}

}
