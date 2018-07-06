package c3.decorate1;


public abstract class Decorate extends Compoent {

	protected Compoent component;
	
	public void setComponent(Compoent component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		component.operation();
	}
	
}
