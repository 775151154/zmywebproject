package com.leo.testpro.designmode23.b_7种结构型模式.a_适配器模式.b_对象的适配器模式;

import com.leo.testpro.designmode23.b_7种结构型模式.a_适配器模式.a_类的适配器模式.Source;

public class Test {
	public static void main(String[] args) {
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
	}
}
