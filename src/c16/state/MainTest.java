package c16.state;

public class MainTest {
	
	public static void main(String[] args) {
		Work work = new Work();
		
		work.setHour(13.5);
		work.WriteProgram();
		
		work.setHour(17);
		work.setFinish(true);
		work.WriteProgram();
	}
	
	
	

}
