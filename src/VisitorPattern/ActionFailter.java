package VisitorPattern;

public class ActionFailter extends AbstractAction{

	@Override
	public void getManResult(AbstractPerson person) {
		System.out.println("����ʧ��ʱ˭Ҳ����Ȱ");
	}

	@Override
	public void getWomanResult(AbstractPerson person) {
		System.out.println("Ů��ʧ��ʱ˭ҲȰ����");
		
	}
}
