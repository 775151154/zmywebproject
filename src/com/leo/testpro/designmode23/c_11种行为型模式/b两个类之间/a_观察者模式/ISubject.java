package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.a_观察者模式;

public interface ISubject {
	// 增加观察者
		public void add(IObserver observer);

		// 删除观察者
		public void del(IObserver observer);

		// 通知所有的观察者
		public void notifyObservers();

		// 自身的操作
		public void operation();
}
