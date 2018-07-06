package c18.memento;

public class MainTest {
	
	public static void main(String[] args) {
		GameRoal lixiaoyao = new GameRoal();
		lixiaoyao.init();
		lixiaoyao.display();
		System.out.println("------------------------");
		
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(lixiaoyao.saveState());
		
		lixiaoyao.fight();
		lixiaoyao.display();
		System.out.println("------------------------");
		
		lixiaoyao.recoverState(stateAdmin.getMemento());
		lixiaoyao.display();
	}

}
