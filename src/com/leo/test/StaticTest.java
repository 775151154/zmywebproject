package com.leo.test;

public class StaticTest {
	public StaticTest() {
		System.out.print("a");// ���췽����new��ʱ��Ż���֣��Һ��ڱ����Ĵ���
	}
	public static void sayOther(String s) {
		System.out.print(s);
	}
	public int say(String s) {
		System.out.print(s);
		return 0;
	}
	// ��ʼ���飬��newʱ�����췽��֮ǰ,����֮ǰִ��
	{
		System.out.print("c");
		inner.innerMethed("d");
	}
	private static inner t = new inner();// ��̬��������Щ�������������֮ǰ�ͷ����ڴ��У���ֻ������һ�Σ�new�����ʱ�ǲ����ٴ�ִ�е��ˡ�
	static {
		System.out.print("e");
		inner.innerMethed("f");// ��̬��ʼ���飬������̬�Ķ����ڼ���֮ǰ�����ó�ʼ����
		new inner();
	}
	private int i = say("g");// ��newʱ�����ڹ��쵫�Ǻ��ڳ�ʼ�����һ��ʵ��������Ҳ����ʵ�����󣺣�ʵ����ʼ���飬ʵ��������--->���췽��
	private inner tt = new inner();// �������������ClassLoader֮���ʼ������ʱ��������ÿ��new���󶼻�ִ�������������
	private innerOther ttt = new innerOther();
	
	static class inner {
		public inner() {
			System.out.print("h");
		}
		public static void innerMethed(String s) {
			System.out.print(s);
		}
		{
			System.out.print("i");
		}
		static {
			System.out.print("j");
		}
	}

	class innerOther {

		public innerOther() {
			System.out.print("k");
		}

		{
			System.out.print("l");
		}

	}

	public static void main(String[] args) {
		System.out.print("m");
		StaticTest outer = new StaticTest();
		System.out.print("n");

		// �ܽ���ǣ�����󣬱����ļ���˳��
		// ��������������֮�󣬾ͳ�ʼ����̬����̬��������̬�飩�����п���new���󣬱������þ�̬��������̬��ֻ����һ�Σ�Ȼ���������ClassLoader�Ͱ���Class������ִ��main������
		// ��new�����ʱ��ִ��˳���ǣ���ʵ����ʼ���飬ʵ��������-->���췽����ÿnewһ������ʱ������ִ��������衣

		// ����̬��������̬��ʼ���飩���� �� ����������ʼ���飩���� �� ���캯���������е������ǰ��մ���ǰ��ѭ��ִ��

		// ���м̳й�ϵʱ�����ǻ������ԭ����new Son������
		// ����ľ�̬����ͱ�����-->����ľ�̬����ͱ�����-->����ģ���ͱ���+���췽����-->����ģ���ͱ���+���췽����
		//
	}
}
