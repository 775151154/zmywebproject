package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.a���������.a_����ģʽ;

/**
 * ����ģʽ������һϵ���㷨������ÿ���㷨��װ������ʹ���ǿ����໥�滻�����㷨�ı仯����Ӱ�쵽ʹ���㷨�Ŀͻ�����Ҫ���һ���ӿڣ�Ϊһϵ��ʵ�����ṩͳһ�ķ�����
 * ���ʵ����ʵ�ָýӿڣ����һ�������ࣨ���п��ޣ����ڸ����ࣩ���ṩ��������
 * 
 * ����ģʽ�ľ���Ȩ���û���ϵͳ�����ṩ��ͬ�㷨��ʵ�֣���������ɾ���㷨���Ը����㷨����װ����ˣ�����ģʽ�������㷨����ϵͳ�У�
 * �ⲿ�û�ֻ��Ҫ�������ĸ��㷨���ɡ�
 * 
 * @author leo
 */
public class Test {
	public static void main(String[] args) {
		String param = "2+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(param);
		System.out.println(result);
	}
}
