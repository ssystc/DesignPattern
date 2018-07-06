package c24.dutychain;

public class JingLiManager extends Manager {

	public JingLiManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(MyRequest request) {
		if(request.getRequestType().equals("请假") && request.getNumber()<3) {
			System.out.println("同意请假");
		}else {
			superior.requestApplications(request);
		}
	}
	
}
