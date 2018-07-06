package c24.dutychain;

public class ZongJingLiManager extends Manager {

	public ZongJingLiManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(MyRequest request) {
		if(request.getRequestType().equals("请假") && request.getNumber()<6) {
			System.out.println("总经理同意请假");
		}else {
			superior.requestApplications(request);
		}
	}
	
}
