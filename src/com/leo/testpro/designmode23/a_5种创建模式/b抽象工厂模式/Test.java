package com.leo.testpro.designmode23.a_5种创建模式.b抽象工厂模式;

import com.leo.testpro.designmode23.a_5种创建模式.a工厂模式.a普通工厂模式.Sender;

public class Test {
	public static void main(String[] args) {
		Provider p = new SenderMailFactory();
		Sender sender = p.produce();
		sender.send();
	}
}
