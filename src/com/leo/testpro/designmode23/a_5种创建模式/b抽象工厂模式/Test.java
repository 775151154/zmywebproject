package com.leo.testpro.designmode23.a_5�ִ���ģʽ.b���󹤳�ģʽ;

import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.Sender;

public class Test {
	public static void main(String[] args) {
		Provider p = new SenderMailFactory();
		Sender sender = p.produce();
		sender.send();
	}
}
