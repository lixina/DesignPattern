package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚集类具体类
 * @author Bywinkey
 *
 */
public class Aggregate extends AbstractAggregate{
	
	private List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator createIterator() {
		return new Iterator(this);
	}
	// 返回聚集总个数
	public int count() {
		int count = items.size();
		return count;
	}
	// 声明一个索引器
	public Object getItems(int index) {
		return items.get(index);
	}
	public void setItems(int index,String name) {
		items.add(index, name);
	}
	
	
}
