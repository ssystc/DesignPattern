package c16.state;

public class SleepingState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.println(String.format("当前时间：%s, 不行了，睡了", w.getHour()));
	}

	
	
}
