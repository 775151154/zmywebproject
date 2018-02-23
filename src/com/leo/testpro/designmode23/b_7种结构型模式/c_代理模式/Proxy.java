package com.leo.testpro.designmode23.b_7种结构型模式.c_代理模式;

public class Proxy implements Sourceable {

	private Sourceable sourcebale;

	public Proxy() {
		// 与装饰模式不一样。区别不大
		this.sourcebale = new Source();
	}

	@Override
	public void method() {
		beforce();
		sourcebale.method();
		after();
	}

	private void beforce() {
		System.out.println("before proxy!");
	}

	private void after() {
		System.out.println("after proxy!");
	}
}
