package com.leo.testpro.designmode23.a_5�ִ���ģʽ.b���󹤳�ģʽ;

import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.Sender;
import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.SmsSender;

public class SenderSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
