package c24.dutychain;

public class ZongCai extends Manager {

	public ZongCai(String name) {
		super(name);
	}

	@Override
	public void requestApplications(MyRequest request) {
		if(request.getRequestType().equals("请假")) {
			System.out.println("总裁同意请假");
		}else if(request.getRequestType().equals("加薪")) {
			System.out.println("同意加薪");
		}
	}

}
