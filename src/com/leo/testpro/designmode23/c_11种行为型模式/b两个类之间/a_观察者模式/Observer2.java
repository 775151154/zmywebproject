package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.a_观察者模式;

public class Observer2 implements IObserver {

	@Override
	public void update() {
		System.out.println("observer2 is resceived!");
	}
}
