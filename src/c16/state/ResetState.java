package c16.state;

public class ResetState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.println(String.format("当前时间：%s, 下班了", w.getHour()));
	}

}
