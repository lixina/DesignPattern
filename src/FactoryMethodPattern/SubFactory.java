package FactoryMethodPattern;

import SimpleFactoryPattern.OperationSub;
import SimpleFactoryPattern.OperationSuper;
/**
 * ���幤��ʵ�ֽӿ�
 * @author Bywinkey
 *
 */
public class SubFactory implements IFactory{

	@Override
	public OperationSuper createOperation() {
		return new OperationSub();
	}

}
