package c8.factory;

public class MainTest {

	public static void main(String[] args) {
		IFactory factory = new VolunteerFactory();
		LeiFeng volunteer = factory.CreateLeiFeng();
		
		volunteer.maimi();
	}
	
}
