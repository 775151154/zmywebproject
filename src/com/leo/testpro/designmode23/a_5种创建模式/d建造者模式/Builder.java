package com.leo.testpro.designmode23.a_5�ִ���ģʽ.d������ģʽ;

import java.util.ArrayList;
import java.util.List;

import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.MailSender;
import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.Sender;
import com.leo.testpro.designmode23.a_5�ִ���ģʽ.a����ģʽ.a��ͨ����ģʽ.SmsSender;

/**
 * ������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й��������������϶���
 * ��ν���϶������ָĳ������в�ͬ�����ԣ���ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ��ġ����ǿ�һ�´��룺
 * ����ǰ��һ����һ��Sender�ӿڣ�����ʵ����MailSender��SmsSender����󣬽����������£�
 * 
 * @author leo
 */
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
