package c3.decorate1;

public class MainTest {
	
	public static void main(String[] args) {
		ConcreteCompoent c = new ConcreteCompoent();
		DecorateA d1 = new DecorateA();
		DecorateB d2 = new DecorateB();
		
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
	}

}
