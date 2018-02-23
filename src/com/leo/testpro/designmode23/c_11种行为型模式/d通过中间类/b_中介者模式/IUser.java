package com.leo.testpro.designmode23.c_11种行为型模式.d通过中间类.b_中介者模式;

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
