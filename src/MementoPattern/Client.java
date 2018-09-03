package MementoPattern;

public class Client {
	
	public static void main(String[] args) {
		// 初始化游戏角色
		GameRole gameRole = new GameRole();
		gameRole.initState();
		gameRole.showState();
		
		// 保存角色状态
		/*RoleStateMemento memento = new RoleStateMemento();
		memento = gameRole.saveState();*/
		
		RoleStateManager memento = new RoleStateManager();
		memento.setMemento(gameRole.saveState());
		
		// 战斗过后体力值为0
		gameRole.fight();
		gameRole.showState();
		
		// 恢复角色状态
		/*gameRole.recoverState(memento);
		gameRole.showState();*/
		
		gameRole.recoverState(memento.getMemento());
		gameRole.showState();
	}
	 
}
