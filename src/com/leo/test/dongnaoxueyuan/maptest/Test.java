package com.leo.test.dongnaoxueyuan.maptest;

import java.util.HashMap;

/**
 * Sam_4_3_面试必考的HashMap底层设计思想.wmv
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		IMap map = new HashMapImpl();
		for (int i = 0; i < 1000; i++) {
			map.put("key" + i, "value" + i);
		}
		for (int i = 0; i < 1000; i++) {
			System.out.println(map.get("key" + i));
		}
		System.out.println(map.keySet());
		System.out.println(map.size());
	}
}
