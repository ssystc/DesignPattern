package c28.status;

public class MainTest {
	
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		
		Success v1 = new Success();
		o.display(v1);
	}

}
