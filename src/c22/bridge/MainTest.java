package c22.bridge;

public class MainTest {

	public static void main(String[] args) {
		HandsetBrand ab;
		ab = new HandsetBrandN();
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddress());
		ab.run();
	}
	
}
