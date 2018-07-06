package c16.state;

public class NoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 13) {
			System.out.println(String.format("当前时间：%s, 午饭，休息", w.getHour()));
		}else {
			w.setCurrent(new AfterNoonState());
			w.WriteProgram();
		}
		
	}

}
