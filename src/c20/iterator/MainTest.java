package c20.iterator;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		
		List<Object> test = new ArrayList<>();
		test.add(0, "大鸟");
		test.add(1, "小菜");
		test.add(2, "老外");
		
		a.setItems(test);
		
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		while(!i.isDone()) {
			System.out.println(i.currentItem());
			i.next();
		}
	}
	
}
