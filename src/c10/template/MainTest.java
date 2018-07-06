package c10.template;

public class MainTest {

	public static void main(String[] args) {
		AbstractClass c;
		c = new ConcreteClassA();
		c.templateMethod();
		
		c = new ConcreteClassB();
		c.templateMethod();
	}
	
}
