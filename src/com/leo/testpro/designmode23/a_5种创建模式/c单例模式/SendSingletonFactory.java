package com.leo.testpro.designmode23.a_5�ִ���ģʽ.c����ģʽ;

import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.MailSender;
import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.Sender;

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
