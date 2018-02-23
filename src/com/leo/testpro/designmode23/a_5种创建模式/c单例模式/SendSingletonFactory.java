package com.leo.testpro.designmode23.a_5种创建模式.c单例模式;

import com.leo.testpro.designmode23.a_5种创建模式.a工厂模式.a普通工厂模式.MailSender;
import com.leo.testpro.designmode23.a_5种创建模式.a工厂模式.a普通工厂模式.Sender;

public class SendSingletonFactory {

	private static SendSingletonFactory instance = new SendSingletonFactory();

	private SendSingletonFactory() {

	}

	public static SendSingletonFactory instance() {
		return instance;
	}

	public Sender getSender() {
		return SentServiceHolder.iSender;
	}

	private static class SentServiceHolder {
		public final static Sender iSender = new MailSender();
	}
}
