package c10.template;

public abstract class AbstractClass {
	
	public abstract void method1();
	
	public abstract void method2();
	
	public void templateMethod() {
		method1();
		method2();
	}

}
