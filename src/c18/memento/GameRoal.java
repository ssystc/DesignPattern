package c18.memento;

public class GameRoal {

	private int hp;
	private int attach;
	private int defence;
	
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
	
	public void display() {
		System.out.println("生命:" + this.hp);
		System.out.println("攻击：" + this.attach);
		System.out.println("防御：" + this.defence);
	}
	
	public void init() {
		this.hp = 100;
		this.attach = 1000;
		this.defence = 1500;
	}
	
	public void fight() {
		this.hp = 0;
		this.attach = 0;
		this.defence = 0;
	}
	
	public RoleStateMemento saveState() {
		return new RoleStateMemento(hp, attach, defence);
	}
	
	public void recoverState(RoleStateMemento memento) {
		this.hp = memento.getHp();
		this.attach = memento.getAttach();
		this.defence = memento.getDefence();
	}
	
}
