package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.dͨ���м���.b_�н���ģʽ;

public abstract class IUser {
    private IMediator mediator;
    public IUser(IMediator mediator) {
        this.mediator = mediator;
    }

    public IMediator getMediator() {
        return mediator;
    }

    public abstract void work();
}
