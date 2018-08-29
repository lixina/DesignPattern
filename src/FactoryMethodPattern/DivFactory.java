package FactoryMethodPattern;

import SimpleFactoryPattern.OperationDiv;
import SimpleFactoryPattern.OperationSuper;
/**
 * 具体工厂实现接口
 * @author Bywinkey
 *
 */
public class DivFactory implements IFactory{

	@Override
	public OperationSuper createOperation() {
		return new OperationDiv();
	}

}
