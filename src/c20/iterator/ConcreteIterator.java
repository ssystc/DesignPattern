package c20.iterator;

public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}
	
	@Override
	public Object first() {
		return aggregate.getItem(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if(current < aggregate.getCount()) {
			ret = aggregate.getItem(current);
		}
		return ret;
		
	}

	@Override
	public boolean isDone() {
		return current>=aggregate.getCount() ? true : false;
	}

	@Override
	public Object currentItem() {
		return aggregate.getItem(current);
	}

	
	
}
