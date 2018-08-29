package FactoryMethodPattern;

import SimpleFactoryPattern.OperationSuper;

/**
 * 客户端
 * @author Bywinkey
 *
 */
public class Client {
	// 简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，
	// 对于客户端来说，去除了与具体产品的依赖
	
	// 工厂方法模式实现时，客户端需要决定实例化哪一个工厂来实现预算类，选择判断的问题还是存在的，也就是说，
	// 工厂方法把简单工厂的内部逻辑判断移到了客户端代码进行，本来加功能要改工厂类，而现在修改客户端
	public static void main(String[] args) {
		IFactory iFactory = new AddFactory();
		OperationSuper operationSuper = iFactory.createOperation();
		operationSuper.setNum1(2);
		operationSuper.setNum2(0);
		double result = operationSuper.getResult();
		System.out.println(result);
	}
}
