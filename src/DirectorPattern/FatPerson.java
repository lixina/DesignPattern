package DirectorPattern;


public class FatPerson extends PersonBuilder {

	@Override
	public void builderHead() {
		System.out.println("胖子的头");
		
	}

	@Override
	public void builderBody() {
		System.out.println("胖子的身体");
	}

	@Override
	public void builderArm() {
		System.out.println("胖子的胳膊");
	}

	@Override
	public void builderFoot() {
		System.out.println("胖子的脚");
	}

	
	
}
