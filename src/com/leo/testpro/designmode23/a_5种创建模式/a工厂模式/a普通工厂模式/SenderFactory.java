package com.leo.testpro.designmode23.a_5种创建模式.a工厂模式.a普通工厂模式;

/**
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
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
			throw new RuntimeException("请输入实例化发送者类型！");
		}
	}

	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("mail");
		sender.send();
	}
}
