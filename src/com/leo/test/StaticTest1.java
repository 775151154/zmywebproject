package com.leo.test;

public class StaticTest1 {
	
	static {
		i = 20;
		// �����i�� �ǿ��Ա���������ġ�
	}
	public static int i =1;
	public static void main(String[] args) {
		StaticTest1 t= new StaticTest1();
		System.out.println(t.i);
	}
}
