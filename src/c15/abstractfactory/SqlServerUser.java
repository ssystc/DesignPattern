package c15.abstractfactory;

public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在sqlServer中插入user");
	}

	@Override
	public User query(int id) {
		System.out.println("在sqlServer中查询一条user数据");
		return null;
	}
}
