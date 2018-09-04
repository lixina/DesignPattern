package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * �ۼ��������
 * @author Bywinkey
 *
 */
public class Aggregate extends AbstractAggregate{
	
	private List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator createIterator() {
		return new Iterator(this);
	}
	// ���ؾۼ��ܸ���
	public int count() {
		int count = items.size();
		return count;
	}
	// ����һ��������
	public Object getItems(int index) {
		return items.get(index);
	}
	public void setItems(int index,String name) {
		items.add(index, name);
	}
	
	
}
