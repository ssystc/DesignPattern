package c2.strategy;

public class CashContext {
	
	private AllCash cash;
	
	public CashContext(String type) {
		switch (type) {
		case "normal":
			this.cash = new NormalCash();
			break;
		case "discount":
			this.cash = new DiscountCash();
			break;
		default:
			throw new RuntimeException();
		}
	}
	
	public double getResult(double money) {
		return this.cash.getMoney(money);
	}

}
