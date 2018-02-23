package com.leo.testpro.jdkaop;

import java.lang.reflect.Proxy;

/**
 * jdkaop 产生代理所花时间少，代理执行效率比较低
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
