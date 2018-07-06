package c3.decorate2;

public class Person {
	
	public String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("装扮的" + name);
	}

}
