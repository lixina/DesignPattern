package FactoryMethodPattern;

import SimpleFactoryPattern.OperationDiv;
import SimpleFactoryPattern.OperationSuper;
/**
 * ���幤��ʵ�ֽӿ�
 * @author Bywinkey
 *
 */
public class DivFactory implements IFactory{

	@Override
	public OperationSuper createOperation() {
		return new OperationDiv();
	}

}
