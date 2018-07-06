package c7.proxy;

public class Pursuit extends GiveGift {
	
	public Girl girl;
	
	public Pursuit(Girl girl) {
		this.girl = girl;
	}
	
	@Override
	public void giveFlowers() {
		System.out.println("送" + girl.name + "花");
	}

	@Override
	public void giveCloses() {
		System.out.println("送" + girl.name + "衣服");
	}
	
}
