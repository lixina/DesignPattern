package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

	private List<AbstractPerson> persons = new ArrayList<AbstractPerson>();
	
	// 增加
	public void add(AbstractPerson person){
		persons.add(person);
	}
	
	// 移除
	public void remove(AbstractPerson person){
		persons.remove(person);
	}
	
	// 查看显示
	public void display(AbstractAction action){
		for (AbstractPerson abstractPerson : persons) {
			abstractPerson.accept(action);
		}
	}
}
