package FactoryMethodPattern;

import SimpleFactoryPattern.OperationSub;
import SimpleFactoryPattern.OperationSuper;
/**
 * 具体工厂实现接口
 * @author Bywinkey
 *
 */
public class SubFactory implements IFactory{

	@Override
	public OperationSuper createOperation() {
		return new OperationSub();
	}

}
