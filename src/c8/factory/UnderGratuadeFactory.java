package c8.factory;

public class UnderGratuadeFactory implements IFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		return new UnderGraduate();
	}

}
