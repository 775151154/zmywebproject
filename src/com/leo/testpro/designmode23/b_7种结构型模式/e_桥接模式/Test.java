package com.leo.testpro.designmode23.b_7种结构型模式.e_桥接模式;

/**
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，
 * 像我们常用的JDBC桥DriverManager一样，JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，
 * 原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了
 * 
 * @author leo
 */
public class Test {
	public static void main(String[] args) {
		Sourceable source1 = new Source1();
		Sourceable source2 = new Source2();
		Bridge bridge = new Bridge();
		bridge.setSourceable(source1);
		bridge.method();

		bridge.setSourceable(source2);
		bridge.method();
	}
}
