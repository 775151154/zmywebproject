package com.leo.testpro.designmode23.b_7种结构型模式.a_适配器模式.a_类的适配器模式;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
}
