package FactoryMethodPattern;

import SimpleFactoryPattern.OperationMul;
import SimpleFactoryPattern.OperationSuper;
/**
 * 具体工厂实现接口
 * @author Bywinkey
 *
 */
public class MulFactory implements IFactory{

	@Override
	public OperationSuper createOperation() {
		return new OperationMul();
	}

}
