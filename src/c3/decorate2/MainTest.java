package c3.decorate2;

public class MainTest {
	
	public static void main(String[] args) {
		Person xiaoCai = new Person("小菜");
		TShirt tShirt = new TShirt();
		Shoes shows = new Shoes();
		
		tShirt.setPerson(xiaoCai);
		shows.setPerson(tShirt);
		shows.show();
		
	}
	
}
