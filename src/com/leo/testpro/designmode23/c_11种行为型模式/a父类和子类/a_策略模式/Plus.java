package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.a���������.a_����ģʽ;

public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String param) {
		int[] intArr = split(param, "\\+");
		return intArr[0] + intArr[1];
	}
}
