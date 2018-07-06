package c27.interpretor;

public class MainTest {
	
	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		context.setText("O 2 E 0.5 G 1 ");
		
		Expression expression = null;
		
		try {
			while (context.getText().length() > 0) {
				String str = context.getText().substring(0, 1);
				switch (str) {
				case "O":
					expression = new Scale();
					break;
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":
				case "A":
				case "B":
					expression = new Note();
					break;
				default:
					break;
				}
				expression.interpret(context);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
