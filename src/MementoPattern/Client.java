package MementoPattern;

public class Client {
	
	public static void main(String[] args) {
		// ��ʼ����Ϸ��ɫ
		GameRole gameRole = new GameRole();
		gameRole.initState();
		gameRole.showState();
		
		// �����ɫ״̬
		/*RoleStateMemento memento = new RoleStateMemento();
		memento = gameRole.saveState();*/
		
		RoleStateManager memento = new RoleStateManager();
		memento.setMemento(gameRole.saveState());
		
		// ս����������ֵΪ0
		gameRole.fight();
		gameRole.showState();
		
		// �ָ���ɫ״̬
		/*gameRole.recoverState(memento);
		gameRole.showState();*/
		
		gameRole.recoverState(memento.getMemento());
		gameRole.showState();
	}
	 
}
