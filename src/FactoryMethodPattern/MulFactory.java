package FactoryMethodPattern;

import SimpleFactoryPattern.OperationMul;
import SimpleFactoryPattern.OperationSuper;
/**
 * ���幤��ʵ�ֽӿ�
 * @author Bywinkey
 *
 */
public class MulFactory implements IFactory{

	@Override
	public OperationSuper createOperation() {
		return new OperationMul();
	}

}
