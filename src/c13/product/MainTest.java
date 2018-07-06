package c13.product;

public class MainTest {
	
	public static void main(String[] args) {
		Direct direct = new Direct();
		ConcreteBuildA b1 = new ConcreteBuildA();
		direct.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		System.out.println("----------------------");
		
		ConcreteBuildB b2 = new ConcreteBuildB();
		direct.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
	}

}
