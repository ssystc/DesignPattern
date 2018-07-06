package c28.status;

public class Failing extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println(ConcreteElementA.getClass().toString() + this.getClass().toString() + "man failing");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementB) {
		System.out.println(ConcreteElementB.getClass().toString() + this.getClass().toString() + "woman failing");
	}
	
}
