package com.leo.testpro.designmode23.c_11种行为型模式.d通过中间类.b_中介者模式;

public class MyMediator implements IMediator {
    private IUser user1;
    private IUser user2;

    @Override
    public void createMediator() {
        // 构造函数没什么意义
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
