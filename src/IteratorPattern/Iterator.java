package IteratorPattern;
/**
 * 迭代器具体类
 * @author Bywinkey
 *
 */
public class Iterator extends AbstractIterator{
	
	private Aggregate aggregate;
	private int current = 0;
	
	public Iterator(Aggregate aggregate) {
		super();
		this.aggregate = aggregate;
	}
	

	@Override
	public Object first() {
		return aggregate;
	}

	@Override
	public Object next() {
		Object object = null;
		current++;
		if (current < aggregate.count()) {
			object = aggregate.getItems(current);
		}
		return object;
	}
	// 判断是否遍历到结尾  到结尾返回true
	@Override
	public boolean isDone() {
		boolean result = current >= aggregate.count() ? true : false;
		return result;
	}

	@Override
	public Object currentItem() {
		return aggregate.getItems(current);
	}
	
}
