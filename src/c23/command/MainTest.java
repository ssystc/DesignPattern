package c23.command;

public class MainTest {
	
	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommond1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommond2 = new BakeMuttonCommand(boy);
		Command bakeChickenWing = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		girl.setOrder(bakeMuttonCommond1);
		girl.setOrder(bakeMuttonCommond2);
		girl.setOrder(bakeChickenWing);
		
		girl.mynotify();
		
	}

}
