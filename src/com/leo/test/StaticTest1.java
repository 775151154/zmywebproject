package com.leo.test;

public class StaticTest1 {
	
	static {
		i = 20;
		// 这里的i， 是可以被用作运算的。
	}
	public static int i =1;
	public static void main(String[] args) {
		StaticTest1 t= new StaticTest1();
		System.out.println(t.i);
	}
}
