package DirectorPattern;


public class ThinPerson extends PersonBuilder {

	@Override
	public void builderHead() {
		System.out.println("���ӵ�ͷ");
		
	}

	@Override
	public void builderBody() {
		System.out.println("���ӵ�����");
	}

	@Override
	public void builderArm() {
		System.out.println("���ӵĸ첲");
	}

	@Override
	public void builderFoot() {
		System.out.println("���ӵĽ�");
	}

	
	
}
