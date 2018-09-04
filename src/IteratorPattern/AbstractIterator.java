package IteratorPattern;
/**
 * ������������
 * @author Bywinkey
 *
 */
public abstract class AbstractIterator {
	
	public abstract Object first();
	public abstract Object next();
	public abstract boolean isDone();
	public abstract Object currentItem();
	
}
