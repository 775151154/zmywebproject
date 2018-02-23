package com.leo.testpro.designmode23.c_11种行为型模式.a父类和子类.a_策略模式;

public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String param) {
		int[] intArr = split(param, "\\+");
		return intArr[0] + intArr[1];
	}
}
