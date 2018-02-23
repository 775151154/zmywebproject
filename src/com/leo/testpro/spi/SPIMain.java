package com.leo.testpro.spi;

import java.util.ServiceLoader;

/**
 * SPI ȫ��Ϊ (Service Provider Interface) ,��JDK���õ�һ�ַ����ṩ���ֻ��ơ� Ŀǰ�в��ٿ�����������������չ���֣�
 * ����˵��������һ�ֶ�̬�滻���ֵĻ��ƣ� �ٸ�������˵�� �и��ӿڣ�������ʱ��̬�ĸ������ʵ�֣���ֻ��Ҫ���һ��ʵ�֣�
 * ���󣬰��¼ӵ�ʵ�֣�������JDK֪����������ͨ����һ���ı��ļ����ɣ� ��˾�ڲ���ĿǰDubbo��ܾͻ���SPI�����ṩ��չ���ܡ�
 * 
 * @author leo
 *
 */
public class SPIMain {
	public static void main(String[] args) {
		// ����HelloInterface�ӿڵ�ʵ�������
		ServiceLoader<HelloInterface> loaders = ServiceLoader.load(HelloInterface.class);
		for (HelloInterface h : loaders) {
			h.sayHello();
		}
	}
}
