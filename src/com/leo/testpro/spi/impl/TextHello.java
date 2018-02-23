package com.leo.testpro.spi.impl;

import com.leo.testpro.spi.HelloInterface;

public class TextHello implements HelloInterface{
	@Override
	public void sayHello() {
		System.out.println("Say Text Hello!");
	}
}
