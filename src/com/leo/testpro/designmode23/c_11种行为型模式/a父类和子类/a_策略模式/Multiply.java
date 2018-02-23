package com.leo.testpro.designmode23.c_11种行为型模式.a父类和子类.a_策略模式;

public class Multiply extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\*");
		return arrayInt[0] * arrayInt[1];
	}
}
