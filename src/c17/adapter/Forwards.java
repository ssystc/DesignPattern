package c17.adapter;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(name + ", 前锋进攻");
	}

	@Override
	public void defense() {
		System.out.println(name + ", 前锋防守");
	}

}
