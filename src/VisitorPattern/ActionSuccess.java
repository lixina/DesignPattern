package VisitorPattern;

public class ActionSuccess extends AbstractAction{

	@Override
	public void getManResult(AbstractPerson person) {
		System.out.println("�������и�ΰ���Ů��");
	}

	@Override
	public void getWomanResult(AbstractPerson person) {
		System.out.println("��������һ�����ɹ�������");
		
	}
}
