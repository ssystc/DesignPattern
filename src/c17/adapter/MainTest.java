package c17.adapter;

public class MainTest {
	
	public static void main(String[] args) {
		Player a = new Forwards("testA");
		a.attack();
		
		Player b = new Guards("testB");
		b.attack();
		
		Player cPlayer = new Translator("yaoming");
		cPlayer.attack();
		cPlayer.defense();
	}
	
}
