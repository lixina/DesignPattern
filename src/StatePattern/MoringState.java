package StatePattern;
/**
 * ��������繤��״̬
 * @author Bywinkey
 *
 */
public class MoringState extends State{

	@Override
	public void writeProgram(Work w) {
		if (w.getHour()<12){
			System.out.println("����"+w.getHour()+"����ٱ�");
		}else{
			NoonState noonState = new NoonState();
			w.setState(noonState);
			noonState.writeProgram(w);
		}
	}

}
