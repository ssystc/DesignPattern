package c8.factory;

public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		return new Volunteer();
	}

}
