package com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.e_�Ž�ģʽ;

/**
 * �Ž�ģʽ���ǰ�����������ʵ�ַֿ���ʹ���ǿ��Ը��Զ����ı仯���Žӵ������ǣ���������ʵ�ֻ����ʹ�ö��߿��Զ����仯��
 * �����ǳ��õ�JDBC��DriverManagerһ����JDBC�����������ݿ��ʱ���ڸ������ݿ�֮������л�����������Ҫ��̫��Ĵ��룬����˿�����ö���
 * ԭ�����JDBC�ṩͳһ�ӿڣ�ÿ�����ݿ��ṩ���Ե�ʵ�֣���һ���������ݿ������ĳ������ŽӾ�����
 * 
 * @author leo
 */
public class Test {
	public static void main(String[] args) {
		Sourceable source1 = new Source1();
		Sourceable source2 = new Source2();
		Bridge bridge = new Bridge();
		bridge.setSourceable(source1);
		bridge.method();

		bridge.setSourceable(source2);
		bridge.method();
	}
}
