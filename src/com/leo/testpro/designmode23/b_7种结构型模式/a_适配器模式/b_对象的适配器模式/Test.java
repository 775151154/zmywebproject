package com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.a_������ģʽ.b_�����������ģʽ;

import com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.a_������ģʽ.a_���������ģʽ.Source;

public class Test {
	public static void main(String[] args) {
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
	}
}
