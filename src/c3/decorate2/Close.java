package c3.decorate2;

public class Close extends Person {

	protected Person person;
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void show() {
		person.show();
	}

}
