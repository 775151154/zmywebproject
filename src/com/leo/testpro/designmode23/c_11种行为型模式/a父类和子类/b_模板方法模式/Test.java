package com.leo.testpro.designmode23.c_11种行为型模式.a父类和子类.b_模板方法模式;

public class Test {
	public static void main(String[] args) {
		AbstractCalculator cal = new Plus();
		System.out.println(cal.calculate("8+9", "\\+"));
	}
}
