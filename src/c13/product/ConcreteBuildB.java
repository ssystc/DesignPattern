package c13.product;

public class ConcreteBuildB extends AbstractBuild {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.add("partX");
	}

	@Override
	public void buildPartB() {
		product.add("partY");
	}

	@Override
	public Product getResult() {
		return product;
	}

	
	
}
