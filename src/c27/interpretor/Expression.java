package c27.interpretor;

import java.lang.reflect.Executable;

public abstract class Expression {

	public void interpret(PlayContext context) {
		if(context.getText().length() == 0) {
			return;
		}else {
			String playKey = context.getText().substring(0, 1);
			context.setText(context.getText().substring(2));
			String playValue = context.getText().substring(0, context.getText().indexOf(" "));
			context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
			Execute(playKey, playValue);
		}
	}
	
	public abstract void Execute(String key, String value);
	
}
