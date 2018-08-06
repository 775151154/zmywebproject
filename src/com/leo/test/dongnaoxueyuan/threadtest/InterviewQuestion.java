package com.leo.test.dongnaoxueyuan.threadtest;

/**
 * ibm面试题：子线程循环30次后暂停，主线程循环40次暂停，子线程循环30次后暂停，主线程循环40次暂停，如此往复，交替50次
 * 
 * @author Administrator
 *
 */
public class InterviewQuestion {
	public static void main(String[] args) {
		// 交替50次
		for (int i = 0; i < 50; i++) {
			final int round = i;
			final boolean isMainThread = false;
			// 子线程
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
						System.out.println("---|---| 子线程：第" + round + "轮，第" + j + "次");
					}
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();

			// 主线程
			for (int j = 0; j < 40; j++) {
				System.out.println("---| 主线程：第" + round + "轮，第" + j + "次");
			}
		}
	}
}
