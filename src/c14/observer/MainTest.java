package c14.observer;

public class MainTest {
	
	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		
		s.attach(new ConcreteObserver(s, "X"));
		s.attach(new ConcreteObserver(s, "Y"));
		
		s.setSubjectState("ABC");
		s.mynotify();
	}

}
