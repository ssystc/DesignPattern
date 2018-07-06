package c2.strategy;

public class MainTest {
	
	public static void main(String[] args) {
		CashContext context = new CashContext("normal");
		System.out.println(context.getResult(10000.0));
		
		CashContext context2 = new CashContext("discount");
		System.out.println(context2.getResult(100000.0));
	}
	
}
