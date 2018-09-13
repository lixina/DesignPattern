package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

	private List<AbstractPerson> persons = new ArrayList<AbstractPerson>();
	
	// ����
	public void add(AbstractPerson person){
		persons.add(person);
	}
	
	// �Ƴ�
	public void remove(AbstractPerson person){
		persons.remove(person);
	}
	
	// �鿴��ʾ
	public void display(AbstractAction action){
		for (AbstractPerson abstractPerson : persons) {
			abstractPerson.accept(action);
		}
	}
}
