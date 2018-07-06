package c27.interpretor;

public class Scale extends Expression {

	@Override
	public void Execute(String key, String value) {
		String scale = "";
		switch (value) {
		case "1":
			scale = "低音";
			break;
		case "2":
			scale = "中音";
			break;
		case "3":
			scale = "高音";
			break;
		default:
			break;
		}
		System.out.println(scale);
		
	}
	
}
