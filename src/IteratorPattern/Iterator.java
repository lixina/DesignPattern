package IteratorPattern;
/**
 * ������������
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
	// �ж��Ƿ��������β  ����β����true
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
