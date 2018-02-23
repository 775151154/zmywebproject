package com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ;

/**
 * ��ͨ����ģʽ�����ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
 * 
 * @author leo
 */
public class SenderFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			throw new RuntimeException("������ʵ�������������ͣ�");
		}
	}

	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("mail");
		sender.send();
	}
}
