package c26.flyweight;

public class MainTest {
	
	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite a = f.getWebSiteCategory("产品展示");
		a.use(new User("小明"));
		
		WebSite b = f.getWebSiteCategory("产品展示");
		b.use(new User("小李"));
		
		System.out.println("--------------");
		System.out.println(f.getWebSiteCount());
	}

}
