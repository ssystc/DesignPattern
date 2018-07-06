package c16.state;

public class AfterNoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 17) {
			System.out.println(String.format("当前时间：%s, 状态不错，继续撸码", w.getHour()));
		}else {
			w.setCurrent(new EveningState());
			w.WriteProgram();
		}
	}

}
