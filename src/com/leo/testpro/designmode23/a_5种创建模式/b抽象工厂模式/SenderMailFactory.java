package com.leo.testpro.designmode23.a_5�ִ���ģʽ.b���󹤳�ģʽ;

import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.MailSender;
import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.Sender;

public class SenderMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
