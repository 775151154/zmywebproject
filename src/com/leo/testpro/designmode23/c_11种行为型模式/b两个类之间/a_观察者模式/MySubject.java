package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.a_�۲���ģʽ;

public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
		// ��ʼ���۲���
		initObservers();
		System.out.println("do something!");
		// ֪ͨ�۲���
		notifyObservers();
	}

	private void initObservers() {
		add(new Observer1());
		add(new Observer2());
	}
}
