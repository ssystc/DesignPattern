package c19.component;

public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company company) {
		
	}

	@Override
	public void remove(Company company) {
		
	}

	@Override
	public void display(int depth) {
		System.out.println(depth + name);
	}

	@Override
	public void duty() {
		System.out.println(name + "公司财务管理");
	}

	
	
}
