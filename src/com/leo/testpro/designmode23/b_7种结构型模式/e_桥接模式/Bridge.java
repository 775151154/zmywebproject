package com.leo.testpro.designmode23.b_7种结构型模式.e_桥接模式;

public class Bridge extends AbstractBridge{

	@Override
	public void method() {
		getSourceable().method();
	}
}
