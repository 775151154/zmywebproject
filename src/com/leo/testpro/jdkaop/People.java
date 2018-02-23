package com.leo.testpro.jdkaop;
/**
 * 目标类的接口，约束目标行为
 * @author leo
 *
 */
public interface People {
	public void eat() throws Throwable;
	public void sleep() throws Throwable;
	public void daDouDou() throws Throwable;
}
