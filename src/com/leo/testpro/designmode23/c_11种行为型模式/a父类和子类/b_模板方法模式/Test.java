package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.a���������.b_ģ�巽��ģʽ;

public class Test {
	public static void main(String[] args) {
		AbstractCalculator cal = new Plus();
		System.out.println(cal.calculate("8+9", "\\+"));
	}
}
