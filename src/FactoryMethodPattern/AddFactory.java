package FactoryMethodPattern;

import SimpleFactoryPattern.OperationAdd;
import SimpleFactoryPattern.OperationSuper;
/**
 * ���幤��ʵ�ֽӿ�
 * @author Bywinkey
 *
 */
public class AddFactory implements IFactory{

	@Override
	public OperationSuper createOperation() {
		return new OperationAdd();
	}

}
