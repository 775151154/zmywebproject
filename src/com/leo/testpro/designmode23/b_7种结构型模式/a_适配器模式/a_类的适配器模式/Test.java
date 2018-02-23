package com.leo.testpro.designmode23.b_7种结构型模式.a_适配器模式.a_类的适配器模式;

/**
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，
 * 将Source的功能扩展到Targetable里
 * 
 * @author leo
 */
public class Test {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.method1();
		adapter.method2();
	}
}
