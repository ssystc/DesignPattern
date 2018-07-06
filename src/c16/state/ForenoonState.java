package c16.state;

public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 12) {
			System.out.println(String.format("当前时间：%s, 精神百倍", w.getHour()));
		}else {
			w.setCurrent(new NoonState());
			w.WriteProgram();
		}
	}

}
