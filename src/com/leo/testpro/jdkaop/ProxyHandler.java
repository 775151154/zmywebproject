package com.leo.testpro.jdkaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler{
	private People people;
	
	public ProxyHandler(People people){
		this.people = people;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		// ���ķ���
		method.invoke(people, null);
		after();
		return null;
	}
	
	/**
	 * ����
	 */
	private void before(){
		System.out.println("֮ǰ");
	}
	
	/**
	 * ����
	 */
	private void after(){
		System.out.println("֮��");
	}
}
