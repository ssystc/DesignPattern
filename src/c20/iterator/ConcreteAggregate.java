package c20.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

	private List<Object> items = new ArrayList<>();
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	private int count;
	
	public int getCount() {
		return items.size();
	}
	
	public Object getItem(int index) {
		return items.get(index);
	}

	public void setItems(List<Object> items) {
		this.items = items;
	}
	
	
}
