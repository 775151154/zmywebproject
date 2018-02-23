package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.dͨ���м���.b_�н���ģʽ;

public class MyMediator implements IMediator {
    private IUser user1;
    private IUser user2;

    @Override
    public void createMediator() {
        // ���캯��ûʲô����
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
