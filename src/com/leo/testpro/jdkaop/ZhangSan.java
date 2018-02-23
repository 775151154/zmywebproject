package com.leo.testpro.jdkaop;

public class ZhangSan implements People{

	@Override
	public void eat() {
		System.out.println("³Ô·¹£¡");
	}

	@Override
	public void sleep() {
		System.out.println("Ë¯¾õ£¡");
	}

	@Override
	public void daDouDou() {
		System.out.println("´ò¶¹¶¹£¡");
	}

}
