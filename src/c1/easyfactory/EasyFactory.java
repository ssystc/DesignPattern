package c1.easyfactory;

public class EasyFactory {

	public static Operation getOperation(char ope) {
		switch (ope) {
		case '+':
			return new AddOperation();
		case '-':
			return new SubOperation();
		default:
			throw new RuntimeException();
		}
	}
}
