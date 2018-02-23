package com.leo.testpro.designmode23.c_11种行为型模式.a父类和子类.a_策略模式;

public abstract class AbstractCalculator {
	public int[] split(String param, String reg) {
		String array[] = param.split(reg);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
