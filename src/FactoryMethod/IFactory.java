package FactoryMethod;

import SimpleFactoryPattern.OperationSuper;

/**
 * 工厂接口
 * @author Bywinkey
 *
 */
public interface IFactory {

	OperationSuper createOperation();
}
