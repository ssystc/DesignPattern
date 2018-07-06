package c26.flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WebSiteFactory {
	
	private Map<String, Object> flyweights = new HashMap<>();
	
	public WebSite getWebSiteCategory(String key) {
		if(!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return (WebSite) flyweights.get(key);
	}
	
	public int getWebSiteCount() {
		return flyweights.size();
	}

}
