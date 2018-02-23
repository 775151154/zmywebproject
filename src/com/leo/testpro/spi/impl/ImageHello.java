package com.leo.testpro.spi.impl;

import com.leo.testpro.spi.HelloInterface;

public class ImageHello implements HelloInterface{
	@Override
	public void sayHello() {
		System.out.println("Say Image Hello!");
	}
}
