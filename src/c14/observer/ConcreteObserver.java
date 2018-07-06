package c14.observer;

public class ConcreteObserver extends Observer {

	private String name;
	private String observerState;
	private ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject, String name) {
		this.subject = subject;
		this.name = name;
	}
	
	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println(name + "的状态是：" + observerState);
	}
	
	
	
}
