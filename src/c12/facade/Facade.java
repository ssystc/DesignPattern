package c12.facade;

public class Facade {
	
	private SubSystem1 s1;
	private SubSystem2 s2;
	private SubSystem3 s3;
	
	public Facade() {
		this.s1 = new SubSystem1();
		this.s2 = new SubSystem2();
		this.s3 = new SubSystem3();
	}
	
	public void methodA() {
		System.out.println("---------------------");
		s1.method1();
		s2.method1();
		s3.method2();
		System.out.println("---------------------");
	}
	
	public void methodB() {
		System.out.println("---------------------");
		s1.method2();
		System.out.println("---------------------");
	}

}
