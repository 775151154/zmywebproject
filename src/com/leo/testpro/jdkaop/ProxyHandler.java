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
		// 核心方法
		method.invoke(people, null);
		after();
		return null;
	}
	
	/**
	 * 切面
	 */
	private void before(){
		System.out.println("之前");
	}
	
	/**
	 * 切面
	 */
	private void after(){
		System.out.println("之后");
	}
}
