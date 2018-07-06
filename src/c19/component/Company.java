package c19.component;

public abstract class Company {

	protected String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	public abstract void add(Company company);
	public abstract void remove(Company company);
	public abstract void display(int depth);
	public abstract void duty();
	
}
