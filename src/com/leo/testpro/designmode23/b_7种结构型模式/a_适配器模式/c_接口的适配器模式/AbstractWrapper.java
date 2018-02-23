package com.leo.testpro.designmode23.b_7种结构型模式.a_适配器模式.c_接口的适配器模式;

public abstract class AbstractWrapper implements Sourceable{

	@Override
	public void method1() {
		System.out.println("this is wrapper2 method1 !");
	}

}
