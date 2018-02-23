package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.a_观察者模式;

public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
		// 初始化观察者
		initObservers();
		System.out.println("do something!");
		// 通知观察者
		notifyObservers();
	}

	private void initObservers() {
		add(new Observer1());
		add(new Observer2());
	}
}
