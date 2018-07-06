package c25.mediator;

public abstract class Country {

	protected UnitedNations mediator;
	
	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}
	
}
