package c28.status;

public class Man extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}

}
