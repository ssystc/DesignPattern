package c15.abstractfactory;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在Access中插入一条User数据");
	}

	@Override
	public User query(int id) {
		System.out.println("在Access中查询一条User数据");
		return null;
	}

}
