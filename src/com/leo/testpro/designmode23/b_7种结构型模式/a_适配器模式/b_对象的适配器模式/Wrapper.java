package com.leo.testpro.designmode23.b_7种结构型模式.a_适配器模式.b_对象的适配器模式;

import com.leo.testpro.designmode23.b_7种结构型模式.a_适配器模式.a_类的适配器模式.Source;
import com.leo.testpro.designmode23.b_7种结构型模式.a_适配器模式.a_类的适配器模式.Targetable;

/**
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 * 
 * @author leo
 */
public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source) {
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is wrapper method2!");
	}

}
