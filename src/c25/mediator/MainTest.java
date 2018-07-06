package c25.mediator;

public class MainTest {
	
	public static void main(String[] args) {
		
		AnLiHui anlihui = new AnLiHui();
		
		USA c1 = new USA(anlihui);
		Iraq c2 = new Iraq(anlihui);
		
		anlihui.setColleague1(c1);
		anlihui.setColleague2(c2);
		
		c1.declare("no hewuqi");
		
	}

}
