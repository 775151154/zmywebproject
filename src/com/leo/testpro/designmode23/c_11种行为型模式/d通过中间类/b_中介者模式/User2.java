package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.dͨ���м���.b_�н���ģʽ;

public class User2 extends IUser {

    public User2(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println(this.getClass().getSimpleName() + "'s work");
    }
}
