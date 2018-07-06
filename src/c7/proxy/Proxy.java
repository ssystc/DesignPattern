package c7.proxy;

public class Proxy extends GiveGift {

	public Pursuit pursuit;
	
	public Proxy(Girl girl) {
		this.pursuit = new Pursuit(girl);
	}
	
	@Override
	public void giveFlowers() {
		pursuit.giveFlowers();
	}

	@Override
	public void giveCloses() {
		pursuit.giveCloses();
	}
	
	

}
