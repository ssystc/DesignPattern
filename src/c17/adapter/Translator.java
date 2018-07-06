package c17.adapter;

public class Translator extends Player {

	private ForeignCenter wjzf = new ForeignCenter();
	
	public Translator(String name) {
		super(name);
		wjzf.setName(name);
	}

	@Override
	public void attack() {
		wjzf.jingong();
	}

	@Override
	public void defense() {
		wjzf.fangshou();
	}

	
	
}
