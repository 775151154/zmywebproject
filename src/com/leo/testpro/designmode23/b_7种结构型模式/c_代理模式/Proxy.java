package com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.c_����ģʽ;

public class Proxy implements Sourceable {

	private Sourceable sourcebale;

	public Proxy() {
		// ��װ��ģʽ��һ�������𲻴�
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
