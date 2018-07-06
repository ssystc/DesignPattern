package c1.easyfactory;

public class MainTest {

	public static void main(String[] args) {
		Operation operation = EasyFactory.getOperation('+');
		operation.numA = 1.0;
		operation.numB = 2.2;
		double test = operation.getResult();
		System.out.println(test);
		System.out.println("----------------------------");
		
		Operation operation2 = EasyFactory.getOperation('-');
		operation2.numA = 3.3;
		operation2.numB = 1.0;
		System.out.println(operation2.getResult());
		System.out.println("----------------------------");
		
		Operation operation3 = EasyFactory.getOperation('*');
	}

}
