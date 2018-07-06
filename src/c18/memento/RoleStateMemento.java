package c18.memento;

public class RoleStateMemento {
	
	private int hp;
	private int attach;
	private int defence;
	
	public RoleStateMemento(int hp, int attach, int defence) {
		this.hp = hp;
		this.attach = attach;
		this.defence = defence;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttach() {
		return attach;
	}

	public void setAttach(int attach) {
		this.attach = attach;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}
	
}
