package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.a���������.a_����ģʽ;

public abstract class AbstractCalculator {
	public int[] split(String param, String reg) {
		String array[] = param.split(reg);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
