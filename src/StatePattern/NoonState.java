package StatePattern;
/**
 * ������°�״̬
 * @author Bywinkey
 *
 */
public class NoonState extends State{

	@Override
	public void writeProgram(Work w) {
		if (w.getHour()<14){
			System.out.println("����"+w.getHour()+"����");
		}else{
			System.out.println("�°�");
		}
	}

}
