package com.leo.testpro.jdkaop;

import java.lang.reflect.Proxy;

/**
 * jdkaop ������������ʱ���٣�����ִ��Ч�ʱȽϵ�
 * @author leo
 *
 */
public class Test {
	public static void main(String[] args) {
		People people = (People) Proxy.newProxyInstance(People.class.getClassLoader(), 
				new Class[]{People.class}, new ProxyHandler(new ZhangSan()));
		try {
			people.eat();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
