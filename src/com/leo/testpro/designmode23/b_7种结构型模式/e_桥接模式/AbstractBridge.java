package com.leo.testpro.designmode23.b_7种结构型模式.e_桥接模式;

public abstract class AbstractBridge {
	private Sourceable sourceable;
	
	public abstract void method();

	public Sourceable getSourceable() {
		return sourceable;
	}

	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
}
