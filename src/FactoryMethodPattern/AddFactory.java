package FactoryMethodPattern;

import SimpleFactoryPattern.OperationAdd;
import SimpleFactoryPattern.OperationSuper;
/**
 * 具体工厂实现接口
 * @author Bywinkey
 *
 */
public class AddFactory implements IFactory{

	@Override
	public OperationSuper createOperation() {
		return new OperationAdd();
	}

}
