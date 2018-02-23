package com.leo.testpro.designmode23.c_11种行为型模式.a父类和子类.b_模板方法模式;

public abstract class AbstractCalculator {
	public final int calculate(String param, String reg) {
		int[] intArr = split(param, reg);
		return calculate(intArr[0], intArr[1]);
	}

	public abstract int calculate(int num1, int num2);

	private int[] split(String param, String reg) {
		String[] strArr = param.split(reg);
		int[] intArr = new int[2];
		intArr[0] = Integer.parseInt(strArr[0]);
		intArr[1] = Integer.parseInt(strArr[1]);
		return intArr;
	}
}
