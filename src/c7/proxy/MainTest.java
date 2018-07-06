package c7.proxy;

public class MainTest {

	public static void main(String[] args) {
		
		Girl girl = new Girl("jiaojiao");
		Proxy test = new Proxy(girl);
		
		test.giveCloses();
	}

}
