package c3.decorate1;

public class DecorateB extends Decorate {

	public void someMethod() {
		System.out.println("B独有的操作");
	}
	
	@Override
	public void operation() {
		super.operation();
		someMethod();
		System.out.println("具体装饰对象B的操作");
	}
	
}
