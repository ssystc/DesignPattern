package c19.component;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
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
		System.out.println(name + "员工招聘");
	}
	
	

}
