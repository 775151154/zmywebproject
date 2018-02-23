package com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.a_������ģʽ.b_�����������ģʽ;

import com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.a_������ģʽ.a_���������ģʽ.Source;
import com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.a_������ģʽ.a_���������ģʽ.Targetable;

/**
 * ����˼·�����������ģʽ��ͬ��ֻ�ǽ�Adapter�����޸ģ���β��̳�Source�࣬���ǳ���Source���ʵ�����Դﵽ��������Ե�����
 * 
 * @author leo
 */
public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source) {
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is wrapper method2!");
	}

}
