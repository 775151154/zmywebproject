package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.a_�۲���ģʽ;

public interface ISubject {
	// ���ӹ۲���
		public void add(IObserver observer);

		// ɾ���۲���
		public void del(IObserver observer);

		// ֪ͨ���еĹ۲���
		public void notifyObservers();

		// ����Ĳ���
		public void operation();
}
