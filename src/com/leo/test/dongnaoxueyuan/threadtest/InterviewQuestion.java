package com.leo.test.dongnaoxueyuan.threadtest;

/**
 * ibm�����⣺���߳�ѭ��30�κ���ͣ�����߳�ѭ��40����ͣ�����߳�ѭ��30�κ���ͣ�����߳�ѭ��40����ͣ���������������50��
 * 
 * @author Administrator
 *
 */
public class InterviewQuestion {
	public static void main(String[] args) {
		// ����50��
		for (int i = 0; i < 50; i++) {
			final int round = i;
			final boolean isMainThread = false;
			// ���߳�
			new Thread(new Runnable() {
				@Override
				public void run() {
					if (isMainThread) {
						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					for (int j = 0; j < 30; j++) {
						System.out.println("---|---| ���̣߳���" + round + "�֣���" + j + "��");
					}
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();

			// ���߳�
			for (int j = 0; j < 40; j++) {
				System.out.println("---| ���̣߳���" + round + "�֣���" + j + "��");
			}
		}
	}
}
