package StatePattern;
/**
 * 下午和下班状态
 * @author Bywinkey
 *
 */
public class NoonState extends State{

	@Override
	public void writeProgram(Work w) {
		if (w.getHour()<14){
			System.out.println("中午"+w.getHour()+"犯困");
		}else{
			System.out.println("下班");
		}
	}

}
