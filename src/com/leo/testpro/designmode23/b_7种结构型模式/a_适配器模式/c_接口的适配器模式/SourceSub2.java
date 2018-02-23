package com.leo.testpro.designmode23.b_7种结构型模式.a_适配器模式.c_接口的适配器模式;

public class SourceSub2 extends AbstractWrapper {
	@Override
	public void method1() {
		System.out.println("this is sourceSub2 method1!");
	}

	@Override
	public void method2() {
		System.out.println("this is sourceSub2 method2!");
	}

}
