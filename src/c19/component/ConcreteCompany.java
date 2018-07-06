package c19.component;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
	
	public ConcreteCompany(String name) {
		super(name);
	}

	private List<Company> children = new ArrayList<>();

	@Override
	public void add(Company company) {
		children.add(company);
	}

	@Override
	public void remove(Company company) {
		children.remove(company);
	}

	@Override
	public void display(int depth) {
		System.out.println(depth + name);
		for(Company c : children) {
			c.display(depth + 2);
		}
	}

	@Override
	public void duty() {
		for(Company c : children) {
			c.duty();
		}
	}
	
	
	

}
