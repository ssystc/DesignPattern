package c15.abstractfactory;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在SqlServer中插入一条department数据");
	}

	@Override
	public Department query(int id) {
		System.out.println("在SqlServer中查询一条department数据");
		return null;
	}
	
	

}
