package c2.strategy;

public class DiscountCash extends AllCash {

	@Override
	public double getMoney(double money) {
		return 0.8*money;
	}
	
}
