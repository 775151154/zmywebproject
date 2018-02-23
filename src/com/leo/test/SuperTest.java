package com.leo.test;

public class SuperTest {
	public static void main(String[] args) {
		A a = new B(new String("a"));
		
	}
}

class A{
	static{
		System.out.println("1");
	}
	public A(){
		System.out.println("A");
	}
	public A(String a){
		System.out.println("D");
	}
}

class B extends A{
	static{
		System.out.println("2");
	}
	public B(){
		super("1");
		System.out.println("B");
	}
	public B(String b){
//		super("1");
		System.out.println("C");
	}
}