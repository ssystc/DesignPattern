package c13.product;

public class ConcreteBuildA extends AbstractBuild {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.add("partA");
	}

	@Override
	public void buildPartB() {
		product.add("partB");
	}

	@Override
	public Product getResult() {
		return this.product;
	}

	
	
}
