package com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.e_�Ž�ģʽ;

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
