package c3.decorate1;

public class DecorateA extends Decorate {
	
	public void someMethod() {
		System.out.println("A区别于其他的decorate的，独有的方法");
	}

	@Override
	public void operation() {
		super.operation();
		someMethod();
		System.out.println("具体装饰对象A的操作");
	}
	
}
