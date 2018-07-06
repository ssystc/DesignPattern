package c24.dutychain;

public class MainTest {

	public static void main(String[] args) {
		JingLiManager jingli = new JingLiManager("jingli");
		ZongJingLiManager zongjingli = new ZongJingLiManager("zongjingli");
		ZongCai zongcai = new ZongCai("zongcai");
		
		jingli.setSuperior(zongjingli);
		zongjingli.setSuperior(zongcai);
		
		MyRequest request = new MyRequest();
		request.setRequestType("请假");
		request.setNumber(1);
		jingli.requestApplications(request);
		
		request.setNumber(5);
		jingli.requestApplications(request);
		
		request.setRequestType("加薪");
		jingli.requestApplications(request);
	}
	
}
