package com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.b_װ��ģʽ;

public class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source) {
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before ...!");
		source.method();
		System.out.println("after ...!");
	}
}
