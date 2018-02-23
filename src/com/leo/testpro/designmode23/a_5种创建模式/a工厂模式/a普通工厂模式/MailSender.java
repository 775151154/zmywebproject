package com.leo.testpro.designmode23.a_5种创建模式.a工厂模式.a普通工厂模式;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is mailsender!");
	}
}
