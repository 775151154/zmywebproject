package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.dͨ���м���.b_�н���ģʽ;

public class User1 extends IUser {
    // �о����캯��ûʲô����
    public User1(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println(this.getClass().getSimpleName() + "'s work");
    }
}
